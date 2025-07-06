package Homework6.CashMachine;

public class CashMachine {
    int countOf20;
    int countOf50;
    int countOf100;
    int balance;
    int depositAmount;

    CashMachine(int banknote20, int banknote50, int banknote100) {
        countOf20 = banknote20;
        countOf50 = banknote50;
        countOf100 = banknote100;
        balance = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
    }

    void deposit(int banknote20, int banknote50, int banknote100) {
        System.out.println("Добавление денег в банкомат");
        countOf20 += banknote20;
        countOf50 += banknote50;
        countOf100 += banknote100;
        depositAmount = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
        System.out.println("Сумма внесения: " + depositAmount);
        balance = balance + depositAmount;
        System.out.println("Ваши деньги успешно внесены");
    }

    void info() {
        System.out.println("Общая сумма в банкомате: " + balance +
        "Количество 20: " + countOf20 +
        "Количество 50: " + countOf50 +
        "Количество 100: " + countOf100);
    }

    boolean CashWithdrawal(int cash) {//TODO Доделать
        return false;
    }
}
