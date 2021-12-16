package ru.gb.sklyarov.lesson3.singleton;

public class SessionSingleton {
    private static volatile SessionSingleton instance;
    private final static Object monitor = new Object();

    private SessionSingleton() {
    }

    public static SessionSingleton getInstance() {
        if (instance == null){
            synchronized (monitor){
                if (instance == null) {
                    instance = new SessionSingleton();
                }
            }
        }
        return instance;
    }
}
