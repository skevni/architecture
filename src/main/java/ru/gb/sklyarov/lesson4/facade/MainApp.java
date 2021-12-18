package ru.gb.sklyarov.lesson4.facade;

import ru.gb.sklyarov.lesson3.TaskBuilder;
import ru.gb.sklyarov.lesson3.model.Task;

public class MainApp {
    public static void main(String[] args) {
        TaskBuilder taskBuilder = new TaskBuilder();

        TaskOperation operation = new TaskOperation(taskBuilder.id(1L)
                .name("task1")
                .build());

        operation.toOpen();
        operation.toInProgress();
        operation.toComplete();

        TaskOperation operation2 = new TaskOperation(new TaskBuilder().id(2L)
                .name("task2")
                .build());
        operation2.toReject();
    }
}
