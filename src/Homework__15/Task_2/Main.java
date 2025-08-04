package Homework__15.Task_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Animals animal = new Animals();

        animal.addAnimal("Собака");
        animal.addAnimal("Кошка");
        animal.addAnimal("Хомяк");

        animal.printAnimals();
        animal.deleteAnimal();
        animal.printAnimals();
    }
}
