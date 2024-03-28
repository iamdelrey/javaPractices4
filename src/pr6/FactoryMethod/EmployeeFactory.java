package pr6.FactoryMethod;

class EmployeeFactory implements WorkerFactory {
    @Override
    public Worker createWorker() {
        return new Employee();
    }
}