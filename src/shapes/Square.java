package shapes;

public class Square extends Quadrilateral {
//    public Square(int side) {
//        super(side, side);
//    }
//
//    // this is overriding the super class (aka rectangle class)
//    public int getPerimeter() {
//        int side = super.length;
//        return 4 * side;
//    }
//    public int getArea() {
//        int side = super.length;
//        return (int) Math.pow(side, 2);
//    }


        protected double side;


        public Square(double side) {
            super(side, side);
        }


        @Override
        public double getPerimeter() {
            return 4*length;
        }

        @Override
        public double getArea() {
            return length*length;
        }


    @Override
    void length(double length) {

    }

    @Override
    void width(double width) {

    }
}
