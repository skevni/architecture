package ru.gb.sklyarov.lesson4.decorator;

public class EmailNotify extends TaskOperationDecorator {
    protected EmailNotify(Operation operation) {
        super(operation);
    }

    @Override
    public boolean changeStatus(String status) {

        System.out.println("send an email");
        return super.changeStatus(status);

    }
}
