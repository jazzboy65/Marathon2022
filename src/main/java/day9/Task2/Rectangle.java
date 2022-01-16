package day9.Task2;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }


    @Override
    public double area() {
        return this.height * this.width;
    }

    @Override
    public double perimeter() {
        return 2 * (this.height + this.width);
    }
}
