public interface Visitor {
    public String visitCircle(Circle circle);
    public String visitCompoundShape(CompoundShape shape);
    public String visitDot(Dot dot);
    public String visitRectangle(Rectangle rect);
}
