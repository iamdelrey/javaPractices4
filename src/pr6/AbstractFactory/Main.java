package pr6.AbstractFactory;

public class Main {

    public static void main(String[] args) {
        MireaFactory mireaFactory = new MireaFactory();

        Cook universityCook = mireaFactory.createCook();
        Employee javaProger = mireaFactory.creatProger();

        universityCook.work();
        javaProger.work();
    }
}
