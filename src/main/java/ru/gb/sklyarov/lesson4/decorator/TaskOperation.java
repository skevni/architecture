package ru.gb.sklyarov.lesson4.decorator;

import ru.gb.sklyarov.lesson3.model.Task;

public class TaskOperation implements Operation {
    private final Task task;

    public TaskOperation(Task task) {
        this.task = task;
    }

    @Override
    public boolean changeStatus(String status) {
        System.out.println(task.getTaskName() + " has been changed status to " + status);
        return true;
    }
}
