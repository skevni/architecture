package ru.gb.sklyarov.lesson4.composite;

import ru.gb.sklyarov.lesson3.model.Task;

public class MainApp {
    /*
        Не могу придумать стоящий пример Компоновщика. То, что я реализовал, можно сделать и в одном классе.
        Например, пригять один объект и выполнить действие, или принять в качестве аргумента List объектов и
        выполнить над ними это же действие.
     */
    public static void main(String[] args) {

        ArchivableTask task1 = new ArchivingTask("Task#1");
        task1.archive();

        ArchivableTask tasks = new ArchivingTasks().add(new ArchivingTask("Task#2"),
                new ArchivingTask("Task#3"),
                new ArchivingTask("Task#4"));

        tasks.archive();
    }
}
