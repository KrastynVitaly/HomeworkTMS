package Homework__14.Task_Star;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TaskStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу: ");
        String filePath = scanner.nextLine();
        File input = new File(filePath);
        File validOutput = new File("C:\\Users\\krast\\IdeaProjects\\HomeworkTMSValidFileReport.txt");
        File invalidOutput = new File("C:\\Users\\krast\\IdeaProjects\\HomeworkTMS\\InvalidFileReport.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(input));
             BufferedWriter validWriter = new BufferedWriter(new FileWriter(validOutput));
             BufferedWriter invalidWriter = new BufferedWriter(new FileWriter(invalidOutput))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String docNumber = line.trim();
                String error = null;
                if (docNumber.length() != 15) {
                    error = "Длина номера документа должна быть 15 символов.";
                } else if (!(docNumber.startsWith("docnum") || docNumber.startsWith("contract"))) {
                    error = "Номер документа должен начинаться с 'docnum' либо 'contract'";
                } else if (!docNumber.matches("[A-Za-z0-9]+")) {
                    error = "Номер документа должен содержать только буквы и цифры.";
                }
                if (error == null) {
                    validWriter.write(docNumber);
                    validWriter.newLine();
                } else {
                    invalidWriter.write(docNumber + " " + error);
                    invalidWriter.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Файл не найден.");
        }
        scanner.close();
    }
}
