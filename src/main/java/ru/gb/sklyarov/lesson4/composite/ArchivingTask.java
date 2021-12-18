package ru.gb.sklyarov.lesson4.composite;

import ru.gb.sklyarov.lesson3.model.Task;

public class ArchivingTask implements ArchivableTask{
    private final Task task;

    public ArchivingTask(Task task) {
        this.task = task;
    }

    @Override
    public void archive() {
        System.out.println( this.task.getTaskName() + " is transferred to an archived state");
    }
}
