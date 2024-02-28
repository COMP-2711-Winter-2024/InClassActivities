public class XMLVisitor implements Visitor {

    private String xml;


    public XMLVisitor(Shape shape) {
        xml = shape.accept(this);
    }


    public String getXML() {
        return xml;
    }

    @Override
    public String visitCircle(Circle circle) {
        xml = "<circle>\n" +
              "    <id>" + circle.getId() + "</id>\n" + 
              "    <radius>" + circle.getRadius() + "</radius>\n" +
              "    <x>" + circle.getX() + "</x>\n" +
              "    <y>" + circle.getY() + "</y>\n" +
              "</circle>";

        return xml;
    }

    @Override
    public String visitCompoundShape(CompoundShape shape) {
        xml = "<compoundShape\n";

        for(Shape child : shape.getChildren()) {
            xml += child.accept(this) + "\n";
        }

        xml += "</compoundShape";
        return xml;
    }

    @Override
    public String visitDot(Dot dot) {
        xml = "<dot>\n" +
              "    <id>" + dot.getId() + "</id>\n" + 
              "    <x>" + dot.getX() + "</x>\n" +
              "    <y>" + dot.getY() + "</y>\n" +
              "</dot>";        
              
        return xml;    
    }

    @Override
    public String visitRectangle(Rectangle rect) {
        xml = "<rectangle>\n" +
              "    <id>" + rect.getId() + "</id>\n" + 
              "    <x>" + rect.getX() + "</x>\n" +
              "    <y>" + rect.getY() + "</y>\n" +
              "    <y>" + rect.getHeight() + "</y>\n" +
              "    <y>" + rect.getWidth() + "</y>\n" +
              "</rectangle>";        
              
        return xml;       
    }
}
 