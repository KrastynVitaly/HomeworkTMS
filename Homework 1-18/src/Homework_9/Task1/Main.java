package Homework_9.Task1;

/*
Задача 1:
Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
который печатает название должности и имплементировать этот метод в созданные
классы.
 */

public class Main {
    public static void main(String[] args) {
        Postable director = new Director();
        Postable worker = new Worker();
        Postable accountant = new Accountant();

        director.showPost();
        worker.showPost();
        accountant.showPost();
    }
}
