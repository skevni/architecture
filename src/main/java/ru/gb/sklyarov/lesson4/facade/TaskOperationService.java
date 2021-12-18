package ru.gb.sklyarov.lesson4.facade;

import ru.gb.sklyarov.lesson3.model.Task;

public class TaskOperationService {
    private final Task task;

    public TaskOperationService(Task task) {
        this.task = task;
    }

    public boolean toOpen(){
        System.out.println(this.task.getTaskName() + " has been transferred to open status");
        // Операции по переводу задачи в состояние открыта
        return true;
    }

    public boolean toInProgress(){
        System.out.println(this.task.getTaskName() + " has been transferred to status in progress ");
        // Операции по переводу задачи в рабочее состояние
        return true;
    }

    public boolean toReject(){
        System.out.println(this.task.getTaskName() + " has been cancelled");
        // Операции по переводу задачи в отклоненное состояние
        return true;
    }

    public boolean toComplete(){
        System.out.println(this.task.getTaskName() +  " has been transferred to completed status");
        // Операции по переводу задачи в завершенное состояние
        return true;
    }

}
