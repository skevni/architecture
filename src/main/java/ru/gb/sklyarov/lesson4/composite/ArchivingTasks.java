package ru.gb.sklyarov.lesson4.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArchivingTasks implements ArchivableTask {
    private final List<ArchivingTask> tasksList = new ArrayList<>();
    @Override
    public void archive() {
        System.out.println("All tasks will be transferred to an archived state");
        for (ArchivingTask task: tasksList) {
            task.archive();
        }
    }

    public ArchivableTask add(ArchivingTask... tasks){
        tasksList.addAll(Arrays.asList(tasks));
        return this;
    }
}
