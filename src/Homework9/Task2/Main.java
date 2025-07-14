package Homework9.Task2;

/*
Задача 2:
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
периметра всех фигур в массиве.
 */

public class Main {
    public static void main(String[] args) {
        double sumOfPerimetres = 0;

        Figure figures[] = new Figure[5];
        figures[0] = new Triangle(10, 10, 10);
        figures[1] = new Triangle(5,4, 3);
        figures[2] = new Rectangle(5, 8);
        figures[3] = new Rectangle(7, 3);
        figures[4] = new Circle(7.5);

        for (Figure figure : figures) {
            sumOfPerimetres += figure.Perimeter();
            System.out.println("Периметр фигуры " + figure.Perimeter());
            System.out.println("Площадь фигуры " + figure.Square());
        }

        System.out.println("Сумма периметров всех фигур: " + sumOfPerimetres);
    }
}
