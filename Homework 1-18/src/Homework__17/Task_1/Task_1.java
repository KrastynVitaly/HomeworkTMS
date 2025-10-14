package Homework__17.Task_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения в формате DD.MM.YYYY:");
        String dateOfBirthday = scanner.nextLine();
        LocalDate birthday = LocalDate.parse(dateOfBirthday, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        LocalDate plusHundredYears = birthday.plusYears(100);
        System.out.println(plusHundredYears + " Вам исполнится 100 лет");
        scanner.close();
    }
}
