package Homework6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете режим ввода:" + "\n" +
                "Предзаполненные значения - 1" + "\n" +
                "Ручной ввод - 2" + "\n"
        );
        System.out.println("Введите число: 1 или 2");
        int input = scanner.nextInt();
        switch (input) {
            case 1: {
                System.out.println("_________________________________________________________________" + "\n" +
                        "Вы выбрали вариант с предзаполненными значениями:" + "\n" +
                        "Исходные данные:" + "\n ");
                CreditCard number1 = new CreditCard("Credit card №1", "5678 1234 6348 3893", 100);
                CreditCard number2 = new CreditCard("Credit card №2","9323 4356 1884 1458");
                CreditCard number3 = new CreditCard();

                number1.CurrentStatus();
                number2.CurrentStatus();
                number3.CurrentStatus();

                System.out.println("_________________________________________________________________" + "\n" +
                        "Операции по картам:" + "\n");
                number1.Accruals("Credit card №1", 100_000);
                number1.CurrentStatus();
                number2.Accruals("Credit card №2",50_000);
                number2.CurrentStatus();
                number3.Offs(111_000);
                number3.CurrentStatus();

                break;
            }
            case 2: {
                System.out.println("Введите номер карты");
                System.out.println("Введите имя карты");
                System.out.println("ведите сумму первоначального баланса");

            }
            default:
                System.out.println("Incorrect value");
        }

    }
}
