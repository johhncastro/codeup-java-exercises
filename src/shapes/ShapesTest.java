package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
//        box1.setWidth(4);
//        box1.setLength(5);
        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
        System.out.println("box1.getArea() = " + box1.getArea());
        Rectangle box2 = new Square(5);
        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
        System.out.println("box2.getArea() = " + box2.getArea());
    }
}
