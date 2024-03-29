package pr7.Decorator;

class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 170;
    }

    @Override
    public String getDescription() {
        return "Капучино";
    }
}