package example.novisitor;

public class Demo {
    public static void main(String[] args) {
        // create some shapes
        Circle c1 = new Circle(1, 1, 1, 1);
        Rectangle r1 = new Rectangle(2, 1, 3, 4, 5);
        
        // create a compound shape
        CompoundShape compoundShape = new CompoundShape(10);
        compoundShape.add(c1);
        compoundShape.add(r1);

        // export them to xml
        String circleXML = new XMLVisitor(c1).getXML();
        String rectXML = new XMLVisitor(r1).getXML();
        String compoundXML = new XMLVisitor(compoundShape).getXML();

        // print xml
        System.out.println(circleXML);
        System.out.println();
        System.out.println(rectXML);
        System.out.println(compoundXML);
        System.out.println(compoundXML);

        // get areas
        double circleArea = new AreaVisitor(c1).getArea();
        double rectArea = new AreaVisitor(r1).getArea();
        double compoundArea = new AreaVisitor(compoundShape).getArea();

        // print areas
        System.out.println(circleArea);
        System.out.println(rectArea);
        System.out.println(compoundArea);



    }
}
