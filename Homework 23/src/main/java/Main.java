import model.Sonnet;
import parsers.dom.MainDom;
import parsers.sax.MainSax;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберете вариант:\n" +
                "1 - распарсить документ с помощью SAX\n" +
                "2 - распарсить документ с помощью DOM.");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        try {
            Sonnet sonnet = null;
            if (input == 1) {
                sonnet = MainSax.parse();
            } else if (input == 2) {
                sonnet = MainDom.parse();
            } else {
                System.out.println("Неверное число.");
            }
            String fileName = sonnet.getAuthor().getFirst_name() + "_"
                    + sonnet.getAuthor().getLast_name() + "_"
                    + sonnet.getTitle() + ".txt";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                List<String> lines = sonnet.getLines();
                for (String line : lines) {
                    writer.write(line);
                    writer.newLine();
                }
            }
            System.out.println("Файл создан.");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
