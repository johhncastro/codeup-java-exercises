package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4,5);
//        box1.setWidth(4);
//        box1.setLength(5);
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//        System.out.println("box1.getArea() = " + box1.getArea());
//        Rectangle box2 = new Square(5);
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
//        System.out.println("box2.getArea() = " + box2.getArea());
        Quadrilateral s1 = new Rectangle(10,20);
        System.out.println("s1.getArea() = " + s1.getArea());
        System.out.println("s1.getPerimeter() = " + s1.getPerimeter());
        Measurable s2 = new Rectangle(10,20);
        System.out.println("s2.getPerimeter() = " + s2.getPerimeter());
        System.out.println("s2.getArea() = " + s2.getArea());
        Measurable s3 = new Square(10);
        System.out.println("s3.getPerimeter() = " + s3.getPerimeter());
        System.out.println("s3.getArea() = " + s3.getArea());
    }
}
