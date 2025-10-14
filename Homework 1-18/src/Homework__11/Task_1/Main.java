package Homework__11.Task_1;

import java.util.Scanner;

/*
1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
найденные строки и их длину.
2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
значений их длины.
3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
средней, а также их длину.
teachmeskills.by
4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
Если таких слов несколько, найти первое из них.
5. Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo".
Задача *:
Дана строка произвольной длины с произвольными словами. Написать программу для
проверки является ли любое выбранное слово в строке палиндромом
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String firstString = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String secondString = scanner.nextLine();
        System.out.println("Введите третью строку:");
        String thirdString = scanner.nextLine();

        WorkWithStrings val = new WorkWithStrings (firstString, secondString,thirdString);
        val.minLengthOfString(firstString, secondString, thirdString);
        val.maxLengthOfString(firstString, secondString, thirdString);
       // val.sortStrings(firstString, secondString, thirdString);
        scanner.close();
    }
}
