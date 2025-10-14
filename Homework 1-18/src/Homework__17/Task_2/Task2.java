package Homework__17.Task_2;

import java.util.Scanner;
import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isItPositive = false;
        System.out.println("Введите числа через пробел:");
        String inputNumbers = scanner.nextLine();
        String[] numbers = inputNumbers.trim().split("\\s+");
        Predicate<Integer> isPositive = num -> num > 0;
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (isPositive.test(num)) {
                System.out.println(num);
                isItPositive = true;
            }
        }
        if (!isItPositive) System.out.println("Положительных чисел нет");
        scanner.close();
    }
}
