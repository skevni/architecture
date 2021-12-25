package ru.gb.sklyarov.lesson6.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.gb.sklyarov.lesson3.model.Task;
import ru.gb.sklyarov.lesson6.mappers.TaskMapper;

import java.util.Objects;
import java.util.WeakHashMap;

public class TaskRepository {
    private final JdbcTemplate jdbcTemplate;
    private final WeakHashMap<Long, Task> identityMap = new WeakHashMap<>();

    @Autowired
    private TaskMapper taskMapper;

    public TaskRepository() {
        this.jdbcTemplate = new JdbcTemplate(DataSourcePostgresql.getDataSource());
    }

    public Task getTaskById(Long id) {
        Task task = identityMap.get(id);
        if (task == null) {
            task = Objects.requireNonNull(jdbcTemplate.query("select t.id, t.name, t.comment, o.id org_id, o.name org_name, tc.id cat_id, tc.name cat_name " +
                            "from tbl_task t inner join task_organization o on o.task_id = t.id" +
                            "inner join task_category tc on tc.task_id = t.id" +
                            "where t.id = ?"
                    , taskMapper, id)).get(id);
            if (task != null) {
                identityMap.put(id, task);
            }
        }
        return task;
    }

    public void save(Task task) {

        if (jdbcTemplate.update("delete from tbl_task where id = ?", task.getId()) != 0) {
            identityMap.remove(task.getId());
        }
    }
}
