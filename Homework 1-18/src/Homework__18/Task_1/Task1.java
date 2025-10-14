package Homework__18.Task_1;

import java.util.ArrayList;
import java.util.Optional;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numberArray = new ArrayList<>();
        numberArray.add(12);
        numberArray.add(15);
        numberArray.add(4);
        numberArray.add(35);
        numberArray.add(63);
        numberArray.add(84);
        numberArray.add(25);
        numberArray.add(7);
        numberArray.add(23);
        numberArray.add(94);

        System.out.println("Исходные значения в numberArray: ");
        for (int element : numberArray) {
            System.out.print(element + " ");
        }
        System.out.println("\n");

        Optional<Integer> objNumArray = numberArray.stream()
                .distinct()
                .filter((n) -> (n % 2) == 0)
                .reduce(Integer::sum);

        int outputArray = numberArray.stream()
                .distinct()
                .filter((n) -> (n % 2) == 0)
                .reduce(0, Integer::sum);

        objNumArray.ifPresent(optional -> System.out.println("Сумма как Optional: " + optional));
        System.out.println("Сумма как int: " + outputArray);

    }
}
