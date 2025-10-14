package Homework__17.Task_4;

import java.util.function.Consumer;

public class Task4 {
    public static void main(String[] args) {
        final double EXCHANGE_RATE = 0.3355;
        Consumer <String> convertBYNToUSD = str -> {
            String[] parts = str.split(" ");
            double amount = Double.parseDouble(parts[0]);
            double result = amount * EXCHANGE_RATE;
            System.out.println(result);
        };
        convertBYNToUSD.accept("1000 BYN");
    }
}
