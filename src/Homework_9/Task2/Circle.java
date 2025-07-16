package Homework_9.Task2;

public class Circle extends Figure {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double Perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double Square() {
        return Math.PI * Math.pow(2, radius);
    }
}
