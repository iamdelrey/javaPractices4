package pr6.AbstractFactory;

public class MireaFactory implements WorkerFactory{
    @Override
    public Cook createCook() {
        return new UniversityCook();
    }

    @Override
    public Employee creatProger() {
        return new JavaProger();
    }
}
