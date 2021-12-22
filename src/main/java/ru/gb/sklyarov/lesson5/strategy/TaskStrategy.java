package ru.gb.sklyarov.lesson5.strategy;

import ru.gb.sklyarov.lesson3.model.Task;

public class TaskStrategy {
    private final Task task;

    public TaskStrategy(Task task) {
        this.task = task;
    }

    public void changeStatus(ChangeStatusStrategy strategy) {
        strategy.changeStatus(false);
    }
}
