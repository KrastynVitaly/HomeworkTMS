package Homework__15.Task_2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Animals {
    private LinkedList<String> animals = new LinkedList<>();

    public void addAnimal(String animal) {
        animals.addFirst(animal);
        System.out.println("Животное добавлено");
    }

    public void deleteAnimal() {
        animals.removeLast();
        System.out.println("Последнее животное удалено");
    }

    public void printAnimals() {
        System.out.println(Arrays.toString((animals.toArray())));
    }
}
