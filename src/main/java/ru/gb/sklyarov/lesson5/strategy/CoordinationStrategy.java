package ru.gb.sklyarov.lesson5.strategy;

public final class CoordinationStrategy implements ChangeStatusStrategy{
    @Override
    public void changeStatus(boolean notify) {
        System.out.println("Some operations to move a task to coordination status");
    }
}
