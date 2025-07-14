package Homework9.Task2;

public class Triangle extends Figure {
    double a;
    double b;
    double c;
    double p;

    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double Perimeter() {
        return a + b + c;
    }

    @Override
    public double Square() {
        p = Perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
