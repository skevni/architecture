package ru.gb.sklyarov.lesson3.model;

import java.util.List;

public class Task {
    private long id;
    private String taskName;
    private List<Category> categories;
    private List<Organization> organizations;
    private String comment;

    public Task() {
    }

    public Task(long id, String taskName, List<Category> categories, List<Organization> organizations, String comment) {
        this.id = id;
        this.taskName = taskName;
        this.categories = categories;
        this.organizations = organizations;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", categories=" + categories +
                ", organizations=" + organizations +
                ", comment='" + comment + '\'' +
                '}';
    }
}
