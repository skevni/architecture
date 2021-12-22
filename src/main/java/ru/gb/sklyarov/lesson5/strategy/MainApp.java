package ru.gb.sklyarov.lesson5.strategy;

import ru.gb.sklyarov.lesson3.TaskBuilder;


public class MainApp {
    public static void main(String[] args) {
        TaskStrategy taskStrategy = new TaskStrategy(new TaskBuilder()
                .id(1L)
                .name("Task#1")
                .build());

        ChangeStatusStrategy strategy = new CoordinationStrategy();
        taskStrategy.changeStatus(strategy);

        ChangeStatusStrategy strategyComplete = new CompleteStrategy();
        taskStrategy.changeStatus(strategyComplete);
    }
}
