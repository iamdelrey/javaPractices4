package pr8.Visitor;

interface Visitor {
    void visit(Circle circle);
    void visit(Triangle triangle);
    void visit(Rectangle rectangle);
}