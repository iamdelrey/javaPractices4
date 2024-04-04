package pr8.Visitor;

class AreaVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Площадь круга с радиусом " + circle.getRadius() + " равна: " + (Math.PI * circle.getRadius() * circle.getRadius()));
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Площадь треугольника с основанием " + triangle.getBase() + " и высотой " + triangle.getHeight() + " равна: " + (0.5 * triangle.getBase() * triangle.getHeight()));
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Площадь прямоугольника с шириной " + rectangle.getWidth() + " и высотой " + rectangle.getHeight() + " равна: " + (rectangle.getWidth() * rectangle.getHeight()));
    }
}