package ru.gb.sklyarov.lesson6.mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.gb.sklyarov.lesson3.model.Category;
import ru.gb.sklyarov.lesson3.model.Organization;
import ru.gb.sklyarov.lesson3.model.Task;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaskMapper implements RowMapper<Task> {

    @Override
    public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
        Task task = new Task();
        List<Category> categories = new ArrayList<>();
        List<Organization> organizations = new ArrayList<>();
        task.setId(rs.getLong("id"));
        task.setTaskName(rs.getString("name"));
        task.setComment(rs.getString("comment"));

        while (rs.next()) {
            categories.add(new Category(rs.getInt("cat_id"), rs.getString("cat_name")));
            organizations.add(new Organization(rs.getInt("org_id"), rs.getString("org_name")));
        }
        task.setCategories(categories);
        task.setOrganizations(organizations);

        return task;
    }
}
