package Homework_8;

public class Rabbit extends Animal {
    final String FOOD = "Grass";

    @Override
    public void voice() {
        System.out.println("Заяц говорит - \"Фыр-фыр\".");
    }

    @Override
    public void eat(String food) {
        if (FOOD.equals(food)) {
            System.out.println("Заяц любит есть травку \n");
        } else {
            System.out.println("Заяц будет недоволен! \n");
        }
    }
}
