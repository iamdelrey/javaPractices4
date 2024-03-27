package pr5;

public class SingletonTest {
    public static void main(String[] args) {
        LazyInitializationSingleton  lazySingleton1 = LazyInitializationSingleton .getInstance();
        LazyInitializationSingleton  lazySingleton2 = LazyInitializationSingleton .getInstance();
        System.out.println("lazySingleton1: " + lazySingleton1);
        System.out.println("lazySingleton2: " + lazySingleton2);
        System.out.println("Являются ли lazySingleton1 и lazySingleton2 одним и тем же экземпляром? " + (lazySingleton1 == lazySingleton2));
        System.out.println();

        EagerInitializationSingleton  eagerSingleton1 = EagerInitializationSingleton .getInstance();
        EagerInitializationSingleton  eagerSingleton2 = EagerInitializationSingleton .getInstance();
        System.out.println("eagerSingleton1: " + eagerSingleton1);
        System.out.println("eagerSingleton2: " + eagerSingleton2);
        System.out.println("Являются ли eagerSingleton1 и eagerSingleton2 одним и тем же экземпляром? " + (eagerSingleton1 == eagerSingleton2));
        System.out.println();

        StaticInnerClassSingleton staticSingleton1 = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton staticSingleton2 = StaticInnerClassSingleton.getInstance();
        System.out.println("staticSingleton1: " + staticSingleton1);
        System.out.println("staticSingleton2: " + staticSingleton2);
        System.out.println("Являются ли staticSingleton1 и staticSingleton2 одним и тем же экземпляром? " + (staticSingleton1 == staticSingleton2));
    }
}