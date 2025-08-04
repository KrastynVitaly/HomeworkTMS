package Homework__15.Task_Star;

public class Main {
    public static void main(String[] args) {
        MyDynamicCollection<String> stringNumbersCollection = new MyDynamicCollection<>(7);
        System.out.println(stringNumbersCollection);
        stringNumbersCollection.add("Ноль");
        stringNumbersCollection.add("Один");
        stringNumbersCollection.add("Два");
        stringNumbersCollection.add("Три");
        stringNumbersCollection.add("Четыре");
        stringNumbersCollection.add("Пять");
        stringNumbersCollection.add("Шесть");
        stringNumbersCollection.add("Семь");
        stringNumbersCollection.add("Восемь");
        stringNumbersCollection.add("Девять");
        System.out.println(stringNumbersCollection);
        System.out.println("Длина коллекции:" + stringNumbersCollection.length());
        stringNumbersCollection.add("new_element");
        System.out.println("Длина коллекции:" + stringNumbersCollection.length());
        System.out.println(stringNumbersCollection);

        stringNumbersCollection.remove(2);
        stringNumbersCollection.remove("Семь");

        System.out.println(stringNumbersCollection);
        System.out.println(stringNumbersCollection.get(4));

        System.out.println("Коллекция содержит \"Три\"? " + stringNumbersCollection.contains("Три"));

        stringNumbersCollection.clear();

        System.out.println(stringNumbersCollection);

    }
}
