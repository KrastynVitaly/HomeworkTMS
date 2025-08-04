package Homework__14.Task_1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String longest_word = "";
        String current;
        Scanner sc = new Scanner(new File("romeo-and-juliet.txt"));
        while (sc.hasNext()) {
            current = sc.next();
            if (current.length() > longest_word.length()) {
                longest_word = current;
            }
        }
        System.out.println("\n" + longest_word + "\n");

        try (FileOutputStream fos = new FileOutputStream("longest-word.txt")) {
            fos.write(longest_word.getBytes());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

