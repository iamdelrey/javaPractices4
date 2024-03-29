package pr7.Decorator;

class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost() {
        return super.getCost() + 20;
    }

    public String getDescription() {
        return super.getDescription() + ", шоколад";
    }
}