package pr6.FactoryMethod;

class CookFactory implements WorkerFactory {
    @Override
    public Worker createWorker() {
        return new Cook();
    }
}
