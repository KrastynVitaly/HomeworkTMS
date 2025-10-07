package Homework_6.CashMachine;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int rub200kol = 2; // Кол-во денежных единиц
        int[] rub200 = new int[rub200kol]; // Хранишь в массиве
        for (int i = 0; i < rub200kol; i++)
            rub200[i] = 200; // заполнение массива
        int rub200nal = 0; // сколько в наличии
        int rub100kol = 3;
        int[] rub100 = new int[rub100kol];
        // Десятки и единицы создашь сам
        int vyvod = 0;
        int sotnya = 0;
        int desyatok = 0;
        int edinica = 0;
        int quantity = 0; // кол-во купюр доступных

        Scanner s = new Scanner(System.in);
        vyvod = s.nextInt();

        if (vyvod < 1000) {
            sotnya = vyvod / 100 * 100;
            desyatok = (vyvod - sotnya) / 10 * 10;
            edinica = vyvod - sotnya - desyatok;
        }

        if (sotnya >= 200) {
            for (int i = 0; i < rub200kol; i++) {
                quantity++;
            }
            int navadachu = sotnya / 200;
            int ostatok = sotnya - navadachu * 100; // Остаток сотенных
            if (navadachu >= quantity) {
                for (int j = 0; j < quantity; j++) {
                    rub200[j] = 0;
                    Arrays.sort(rub200);

                }
                System.out.println("Двухсот рублевых выданно" + quantity + "штук");
            } else if (1 > 0) { // тут допишешь если кол-во нет в банкомате
                // мситает по сотням потом по 50 рублевым и так
                // далее

            }
        } else if (1 > 0) { // тут так же, если только запрошеная сумма меньше
            // 200 и так далее

        }

    }

}