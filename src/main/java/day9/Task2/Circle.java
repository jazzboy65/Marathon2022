package day9.Task2;

public class Circle extends Figure {
    private final double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public double perimeter() {
        return 2*this.radius*Math.PI;
    }
}
