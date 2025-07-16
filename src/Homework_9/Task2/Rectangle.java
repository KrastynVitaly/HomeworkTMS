package Homework_9.Task2;

public class Rectangle extends Figure {
    private double height;
    private double width;

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double Perimeter() {
        return 2 * (height * width);
    }

    @Override
    public double Square() {
        return height * width;
    }
}
