package ru.gb.sklyarov.lesson3.singleton;

public class ConnectionSingleton {
    private static volatile ConnectionSingleton instance;
    private final static Object monitor = new Object();

    private ConnectionSingleton() {
    }

    public static ConnectionSingleton getInstance() {
        if (instance == null){
            synchronized (monitor){
                if (instance == null) {
                    instance = new ConnectionSingleton();
                }
            }
        }
        return instance;
    }
}
