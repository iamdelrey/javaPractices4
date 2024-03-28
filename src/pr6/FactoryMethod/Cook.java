package pr6.FactoryMethod;

class Cook implements Worker {
    @Override
    public void work() {
        System.out.println("Я готовлю");
    }
}
