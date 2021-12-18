package ru.gb.sklyarov.lesson4.decorator;

public abstract class TaskOperationDecorator implements Operation {
    private final Operation operation;

    protected TaskOperationDecorator(Operation operation) {
        this.operation = operation;
    }

    @Override
    public boolean changeStatus(String status) {
        return operation.changeStatus(status);
    }
}
