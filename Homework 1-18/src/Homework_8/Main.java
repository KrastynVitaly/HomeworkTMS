package Homework_8;

/*
Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
Переопределить методы voice(), eat(String food) чтобы они выводили верную
информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
туда “Grass” он должен написать в консоли, что любит есть травку. Если передадим
“Meat” или другую строку, то он будет недоволен.
*/
public class Main {
    public static void main(String[] args)  {

        Dog dog = new Dog("Bone");
        dog.voice();
        dog.eat("Bone");

        Rabbit rabbit = new Rabbit();
        rabbit.voice();
        rabbit.eat("Grass");

        Tiger tiger = new Tiger("Meat");
        tiger.voice();
        tiger.eat("Grass");

        var dogFabric = DogFabric.getDog("Fabric", "Bone");  //    <- Создаём объект через фабричный методом
        dogFabric.voice();
        dogFabric.eat("Bone");

        DogSingleton dogSingleton = DogSingleton.getInstance();    //    <- Singleton
        dogSingleton.voice();
        dogSingleton.eat("Meat");
    }
}