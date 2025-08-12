package Homework__17.Task_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> charList = new ArrayList<>();
        for (char c : input.toCharArray()) {
            charList.add(c);
        }
        Supplier<String> reverseString = () -> {
            Collections.reverse(charList);
            StringBuilder sb = new StringBuilder(charList.size());
            for (char c : charList) {
                sb.append(c);
            }
            String reversed = sb.toString();
            return ("Перевёрнутая строка: " + reversed);
        };
        System.out.println(reverseString.get());
        scanner.close();
    }
}
