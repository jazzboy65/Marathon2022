package day9.Task2;

public class Triangle extends Figure {
    private final double length1;
    private final double length2;
    private final double length3;



    public Triangle(double length1, double length2, double length3,String color) {
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    public double getLength1() {
        return length1;
    }

    public double getLength2() {
        return length2;
    }

    public double getLength3() {
        return length3;
    }


    @Override
    public double area() {
            double p = ((this.length1 + this.length2 + this.length3)/2);
        return Math.sqrt(p*(p-this.length1)*(p-this.length2)*(p-this.length3));
    }

    @Override
    public double perimeter() {
        return this.length1 + this.length2 + this.length3;
    }
}
