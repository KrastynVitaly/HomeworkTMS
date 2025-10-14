package Homework__14.Task_1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("romeo-and-juliet.txt");
        int i = -1;
        StringBuilder text = new StringBuilder();
        while ((i = fis.read()) != -1) {
            text.append((char) i);
        }
        fis.close();

        String[] words = String.valueOf(text).split("[^a-zA-Z]");
        String longest_word = "";
        for (String word : words )
            if (word.length() > longest_word.length()) {
                longest_word = word;
            }

        System.out.println("\n" + longest_word + "\n");

        try (FileOutputStream fos = new FileOutputStream("longest-word.txt")) {
            fos.write(longest_word.getBytes(), 0, longest_word.length());
            fos.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

