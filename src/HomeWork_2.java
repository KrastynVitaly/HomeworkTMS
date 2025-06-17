/*
import java.util.Scanner;

public class HomeWork_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Task 1
        */
/* Написать программу для вывода названия поры года по номеру
        месяца. При решении используйте оператор switch-case.*//*

         */
/*int season = scanner.nextInt();
         switch (season){
             case 1  -> System.out.println("Зима");
             case 2  -> System.out.println("Зима");
             case 3  -> System.out.println("Весна");
             case 4  -> System.out.println("Весна");
             case 5  -> System.out.println("Весна");
             case 6  -> System.out.println("Лето");
             case 7  -> System.out.println("Лето");
             case 8  -> System.out.println("Лето");
             case 9  -> System.out.println("Осень");
             case 10 -> System.out.println("Осень");
             case 11 -> System.out.println("Осень");
             case 12 -> System.out.println("Зима");
             default -> System.out.println("Unknown");
         }*//*


        // Task 2
        */
/* Написать программу для вывода названия поры года по номеру
        месяца. При решении используйте оператор if-else-if.*//*


        */
/*
        int month = scanner.nextInt();
        if (month == 12 || month == 1 || month == 2){
            System.out.println("Зима");
        }else if ((month == 3 || month == 4 || month == 5)){
            System.out.println("Весна");
        }else if ((month == 6 || month == 7 || month == 8)) {
            System.out.println("Лето");
        }else if ((month == 9 || month == 10 || month == 11)){
            System.out.println("Осень");
        } else System.out.println("Unknown");
        *//*


        // Task 3
        */
/*Напишите программу, которая будет принимать на вход число и на выход
        будет выводить сообщение четное число или нет.
        Для определения четности числа используйте операцию
        получения остатка от деления (операция выглядит так: '% 2').*//*

        */
/*
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Не четное");
        }
        *//*


        // Task 4
        */
/*Для введенного числа t (температура на улице) вывести:
        Если t>–5, то вывести «Тепло». Если –5>= t > –20,
        то вывести «Нормально». Если –20>= t, то вывести «Холодно».*//*

        */
/*
        int t = scanner.nextInt();
        if (t > -4) {
            System.out.println("Тепло");
        }else if (t <= -5 & t > -20){
            System.out.println("Нормально");
        } else System.out.println("Холодно");
        *//*

        // Task 5
        // При помощи цикла for вывести на экран нечетные числа от 1 до 99.
        */
/*
        for (int i = 0; i < 100; i++) {
            if( i % 2 == 1) {
                System.out.println(i);
            }
        }
        *//*


        // Task 6
        // Необходимо вывести на экран числа от 5 до 1.
        */
/*
        for (int i = 5; i > 0 ; i--) {
            System.out.println(i);
        }
        *//*


        // Task 7
        */
/*Напишите программу, где пользователь вводит любое целое положительное число.
        А программа суммирует все числа от 1 до введенного пользователем числа.
        Для ввода числа воспользуйтесь классом Scanner.*//*


        */
/*
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
        *//*


        // Task 8
        */
/*Необходимо, чтоб программа выводила на экран вот такую последовательность:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.*//*


        */
/*
        int i = 1;
        while (i < 100 ){
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        *//*


        // Task 9
        //Вывести 10 первых чисел последовательности 0, -5,-10,-15.

        */
/*
        int x = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(x + ", ");
            x -= 5;
        }
        *//*


        //Task 10
        //Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.

        */
/*
        for (int i = 10; i <= 20 ; i++) {
            System.out.println(i*i);
        }
        *//*


        //Cкучно
        */
/*1. Необходимо написать программу, которая бы вывела в консоль
        звездочки вот таким образом, как на картинке ниже.(с пробелами между *)
            * * *
            * * *
            * * *
        *//*

        //Вариант 1
//        for (int i = 0; i < 3; i++) {
//            System.out.println("* * *");
//        }

        //Вариант 2
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print('*' + " ");
//            }
//            System.out.println();
//        }

        */
/*2. Выведите на экран первые 11 членов последовательности Фибоначчи.
         Напоминаем, что: первый и второй члены последовательности равны
         единицам а каждый следующий — сумме двух предыдущих.
         То есть числа Фибоначчи - это 1  1  2  3  5  8  13  21  34  55  89  и т.д.*//*


        */
/*

        int x = 0;
        int y = 1;
        int z;
        System.out.print(x + " " + y + " ");
        for (int i = 3; i <= 11; i++) {
            z = x + y;
            System.out.print(z + " ");
            x = y;
            y = z;
        }
        *//*


        scanner.close();
    }
}
*/
