package singleton;

public class SingletonInitialized {
    private static final SingletonInitialized INSTANCE = new SingletonInitialized();

    private SingletonInitialized() {}

    public static SingletonInitialized getInstance() {
        return INSTANCE;
    }
}
