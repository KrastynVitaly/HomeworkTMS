package Homework5;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sum = 0;
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Исходный массив:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Введите числа, которые нужно добавить к элементам массива:");
        //Прибавляем числа к элементам массива
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] += scanner.nextInt();
            }
        }
        System.out.println("Массив после прибавления чисел:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Сумма элементов массива: " + sum);

        //Task 2
        System.out.println("Шахматная доска:");
        char[][] array2 = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) {
                    array2[i][j] = 'B';
                } else {
                    array2[i][j] = 'W';
                }
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        //Task 3
        System.out.println("Введите размер массива:");
        int n3 = scanner.nextInt();
        int m3 = scanner.nextInt();
        int count = 0;
        int[][] array3 = new int[n3][m3];
        for (int i = 0; i < n3; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m3; j++) {
                    array3[i][j] = count;
                    count++;
                }
            } else {
                for (int j = m3- 1; j >= 0; j--) {
                    array3[i][j] = count;
                    count++;
                }
            }
        }
        for (int i = 0; i < n3; i++) {
            for (int j = 0; j < m3; j++) {
                String str = String.format("%-3s", String.valueOf(array3[i][j]));
                System.out.print(str);
            }
            System.out.println();
        }
        scanner.close();
    }
}


