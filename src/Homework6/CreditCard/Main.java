package Homework6.CreditCard;

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

                number1.currentStatus();
                number2.currentStatus();
                number3.currentStatus();

                System.out.println("_________________________________________________________________" + "\n" +
                        "Операции по картам:" + "\n");
                number1.accruals("Credit card №1", 100_000);
                number1.currentStatus();
                number2.accruals("Credit card №2",50_000);
                number2.currentStatus();
                number3.offs(111_000);
                number3.currentStatus();

                break;
            }
            case 2: {
                System.out.println("Введите колличество карт:");
                int countOfCards = scanner.nextInt();
                String[][] array = new String[countOfCards][3];
                for (int i = 0; i < countOfCards; i++) {
                    System.out.println("Введите имя карты");
                    array[i][0] = scanner.next();
                    System.out.println("Введите номер карты");
                    array[i][1] = scanner.next();
                    System.out.println("Введите сумму первоначального баланса");
                    array[i][2] = scanner.next();
                }
                for (int i = 0; i < countOfCards; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            }
            default:
                System.out.println("Incorrect value");
        }

    }
}
