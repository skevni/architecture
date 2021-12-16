package ru.gb.sklyarov.lesson3;

import ru.gb.sklyarov.lesson3.model.Category;
import ru.gb.sklyarov.lesson3.model.Organization;
import ru.gb.sklyarov.lesson3.model.Task;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Task task = new TaskBuilder().id(1L)
                .name("Task1")
                .category(Arrays.asList(new Category(1, "Category1"), new Category(2,"Category2")))
                .organization(Arrays.asList(new Organization(1, "Organization1"), new Organization(2, "Organization2")))
                .comment("Some text")
                .build();
        System.out.println(task.toString());

        task = new TaskBuilder().id(2L)
                .name("Task2")
                .comment("An incomplete class")
                .build();
        System.out.println(task.toString());
    }
}
