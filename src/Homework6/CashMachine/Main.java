package Homework6.CashMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CashMachine cm = new CashMachine(10, 10, 10);
        cm.deposit(1, 2, 3);
        cm.info();
        scanner.close();
    }
}
