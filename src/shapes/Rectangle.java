package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
//    protected int width;
//    protected int length;
//
//    public Rectangle(){}
//
//    public Rectangle(int width, int length) {
//        this.width = width;
//        this.length = length;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getArea(){
//        return length * width;
//    }
//    public int getPerimeter(){
//        return 2 * length + 2 * width;
//    }

    public Rectangle(double length, double width) {
        super(length,width);
    }

    @Override
    public double getPerimeter() {
        return 2 *length + 2* width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    void length(double length) {

    }

    @Override
    void width(double width) {

    }
}
