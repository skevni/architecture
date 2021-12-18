package ru.gb.sklyarov.lesson4.facade;

import ru.gb.sklyarov.lesson3.TaskBuilder;

public class MainApp {
    public static void main(String[] args) {
        TaskBuilder taskBuilder = new TaskBuilder();

        TaskOperationService operation = new TaskOperationService(taskBuilder.id(1L)
                .name("task1")
                .build());

        operation.toOpen();
        operation.toInProgress();
        operation.toComplete();

        TaskOperationService operation2 = new TaskOperationService(new TaskBuilder().id(2L)
                .name("task2")
                .build());
        operation2.toReject();
    }
}
