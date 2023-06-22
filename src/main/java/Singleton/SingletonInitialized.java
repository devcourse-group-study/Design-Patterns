package Singleton;

public class SingletonInitialized {
    private static final SingletonInitialized instance = new SingletonInitialized();

    private SingletonInitialized() {}

    public static SingletonInitialized getInstance() {
        return instance;
    }
}
