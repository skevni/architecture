package ru.gb.sklyarov.lesson3;

import ru.gb.sklyarov.lesson3.model.Category;
import ru.gb.sklyarov.lesson3.model.Organization;
import ru.gb.sklyarov.lesson3.model.Task;

import java.util.List;

/*
 * Построитель задачи (инцидента)
 */
public class TaskBuilder {
    private final Task task;

    public TaskBuilder() {
        this.task = new Task();
    }

    public TaskBuilder id(long id) {
        task.setId(id);
        return this;
    }

    public TaskBuilder name(String name) {
        task.setTaskName(name);
        return this;
    }
    public TaskBuilder category(List<Category> categories) {
        task.setCategories(categories);
        return this;
    }
    public TaskBuilder organization(List<Organization> organizations) {
        task.setOrganizations(organizations);
        return this;
    }
    public TaskBuilder comment(String comment) {
        task.setComment(comment);
        return this;
    }

    public Task build() {
        return task;
    }


}

