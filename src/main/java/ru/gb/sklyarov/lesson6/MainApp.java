package ru.gb.sklyarov.lesson6;

import ru.gb.sklyarov.lesson3.model.Task;
import ru.gb.sklyarov.lesson6.repositories.TaskRepository;

public class MainApp {
    public static void main(String[] args) {
        TaskRepository taskDao = new TaskRepository();
        Task task = taskDao.getTaskById(1L);

        System.out.println(task.toString());

    }
}
