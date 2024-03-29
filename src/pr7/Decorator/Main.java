package pr7.Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Описание: " + coffee.getDescription() + " | стоимость: " + coffee.getCost() + " рублей");

        coffee = new SyrupDecorator(coffee);
        System.out.println("Описание: " + coffee.getDescription() + " | стоимость: " + coffee.getCost() + " рублей");

        coffee = new ChocolateDecorator(coffee);
        System.out.println("Описание: " + coffee.getDescription() + " | стоимость: " + coffee.getCost() + " рублей");
    }
}