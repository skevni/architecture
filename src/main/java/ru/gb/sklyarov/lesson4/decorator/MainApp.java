package ru.gb.sklyarov.lesson4.decorator;

import ru.gb.sklyarov.lesson3.TaskBuilder;

public class MainApp {
    // я сделал к переводу задачи в какой-то статус отправление email
    // можно было сделать операцию по регистрации задачи, например, во внешней системе.
    public static void main(String[] args) {
        Operation operation = new TaskOperation(new TaskBuilder().id(1L).name("Task#1").build());
        operation = new EmailNotify(operation);

        operation.changeStatus("In progress");
    }
}
