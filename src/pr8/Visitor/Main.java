package pr8.Visitor;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Triangle(3, 4), new Rectangle(4, 5)};
        Visitor visitor = new AreaVisitor();

        for (Shape shape : shapes) {
            shape.accept(visitor);
        }
    }
}