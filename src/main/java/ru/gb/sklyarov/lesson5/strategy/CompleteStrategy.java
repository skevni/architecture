package ru.gb.sklyarov.lesson5.strategy;

public final class CompleteStrategy implements ChangeStatusStrategy{
    @Override
    public void changeStatus(boolean notify) {
        System.out.println("Some operations to move a task to completed status");
    }
}
