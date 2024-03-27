package pr5;

public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
        // Приватный конструктор
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }
}