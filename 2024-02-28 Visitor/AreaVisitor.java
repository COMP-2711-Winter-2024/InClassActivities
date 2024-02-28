package example.novisitor;

public class AreaVisitor implements Visitor {

    double area;

    public AreaVisitor(Shape shape) {
        area = Double.parseDouble(shape.accept(this));
    }

    public double getArea() {
        return area;
    }

    @Override
    public String visitCircle(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        return Double.toString(area);
    }

    @Override
    public String visitCompoundShape(CompoundShape shape) {
        double area = 0;

        for(Shape child : shape.getChildren()) {
            area += Double.parseDouble(child.accept(this));
        }

        return Double.toString(area);
    }

    @Override
    public String visitDot(Dot dot) {
        return "0";
    }

    @Override
    public String visitRectangle(Rectangle rect) {
        double area = rect.getHeight() * rect.getWidth();
        return Double.toString(area);
    }

}
