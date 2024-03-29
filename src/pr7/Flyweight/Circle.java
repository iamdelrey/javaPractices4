package pr7.Flyweight;

class Circle implements Shape {
    private final String color;
    private final int radius;
    private int x;
    private int y;

    public Circle(String color) {
        this.color = color;
        this.radius = 10;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг " + color + " с радиусом " + radius + " в точке (" + x + ", " + y + ")");
    }
}