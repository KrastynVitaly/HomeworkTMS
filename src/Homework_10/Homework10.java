package Homework_10;

/*
Задача 1:
Создать класс для описания пользователя системы. Переопределить в классе методы
toString, hashcode и equals. Создать несколько экземпляров класса с одним и тем же
значением полей и сравнить с помощью метода equals.
 */
public class Homework10 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Иванов", "Иван", 20);
        User user1 = new User("Den99");
        User user2 = new User("Tom", 567, person);
        User user3 = new User("Tom", 567, person);
        User user4 = new User("Den008", 123 ,person);
        User user5 = user3.deepClone();
        User user6 = user3.clone();

        System.out.println("Users:");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
        System.out.println();

        System.out.println("Hashcode пользователей:");
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());
        System.out.println(user4.hashCode());
        System.out.println(user5.hashCode());
        System.out.println();

        System.out.println("Сравнение user2 и user3");
        System.out.println(user2.equals(user3)); // Выводит true
        System.out.println(user3.equals(user5)); // Выводит false

    }
}
