package shapes;

public class Circle {
        private double radius;

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public Circle(double radius){

        }

        public double getArea(){
            return this.radius*this.radius;
        }

        public double getCircumference(){
            return this.radius*2*Math.PI;
        }


}
