package ru.gb.sklyarov.lesson4.composite;

import ru.gb.sklyarov.lesson3.TaskBuilder;
import ru.gb.sklyarov.lesson3.model.Task;

public class MainApp {
    /*
        Не могу придумать стоящий пример Компоновщика. То, что я реализовал, можно сделать и в одном классе.
        Например, пригять один объект и выполнить действие, или принять в качестве аргумента List объектов и
        выполнить над ними это же действие.
     */
    public static void main(String[] args) {

        ArchivableTask task1 = new ArchivingTask(new TaskBuilder().id(1L).name("Task#1").build());
        task1.archive();

        ArchivableTask tasks = new ArchivingTasks().add(new ArchivingTask(new TaskBuilder().id(2L).name("Task#2").build()),
                new ArchivingTask(new TaskBuilder().id(3L).name("Task#3").build()),
                new ArchivingTask(new TaskBuilder().id(4L).name("Task#4").build()));

        tasks.archive();
    }
}
