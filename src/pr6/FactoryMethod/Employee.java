package pr6.FactoryMethod;

class Employee implements Worker {
    @Override
    public void work() {
        System.out.println("Я работаю");
    }
}