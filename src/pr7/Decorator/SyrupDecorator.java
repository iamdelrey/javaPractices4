package pr7.Decorator;

class SyrupDecorator extends CoffeeDecorator {
    public SyrupDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost() {
        return super.getCost() + 20;
    }

    public String getDescription() {
        return super.getDescription() + ", сироп";
    }
}