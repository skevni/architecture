package ru.gb.sklyarov.lesson4.composite;

public class ArchivingTask implements ArchivableTask{
    private String name;

    public ArchivingTask(String name) {
        this.name = name;
    }

    @Override
    public void archive() {
        System.out.println( this.name + " is transferred to an archived state");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
