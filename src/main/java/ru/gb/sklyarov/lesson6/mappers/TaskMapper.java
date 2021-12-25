package ru.gb.sklyarov.lesson6.mappers;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import ru.gb.sklyarov.lesson3.model.Category;
import ru.gb.sklyarov.lesson3.model.Organization;
import ru.gb.sklyarov.lesson3.model.Task;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaskMapper implements ResultSetExtractor<Map<Long,Task>> {

    @Override
    public Map<Long, Task> extractData(ResultSet rs) throws SQLException, DataAccessException {
        Map<Long, Task> tasks = new HashMap<>();

        while (rs.next()) {
            long key = rs.getLong("id");
            if (!tasks.containsKey(key)) {
                Task task = new Task();
                task.setId(key);
                task.setTaskName(rs.getString("name"));
                task.setComment(rs.getString("comment"));
                task.setCategories(new ArrayList<>());
                task.setOrganizations(new ArrayList<>());
                tasks.put(key, task);
            } else {
                tasks.get(key).getCategories().add(new Category(rs.getInt("cat_id"), rs.getString("cat_name")));
                tasks.get(key).getOrganizations().add(new Organization(rs.getInt("org_id"), rs.getString("org_name")));
            }
        }

        return tasks;
    }
}
