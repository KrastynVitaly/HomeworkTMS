package Homework__17.Task_3;

import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        final double EXCHANGE_RATE = 0.3355;
        Function<String, Double> convertBYNToUSD = str -> {
            String[] parts = str.split(" ");
            double amount = Double.parseDouble(parts[0]);
            return amount * EXCHANGE_RATE;
        };
        System.out.println(convertBYNToUSD.apply("1000 BYN"));
    }
}
