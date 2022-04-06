package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
        protected double length;
        protected double width;

        public Quadrilateral(){}

        public Quadrilateral(double length, double width) {
               this.length = length;
               this.width= width;
        }


        abstract void length(double length);
        abstract void width(double width);
        public double getArea(){return length * width;}
        public double getPerimeter(){ return 2 * length + 2 * width;}
}
