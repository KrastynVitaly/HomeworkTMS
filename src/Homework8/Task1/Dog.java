package Homework8.Task1;

public class Dog extends Animal {
    private final String food;

    public Dog(String food) {
        this.food = food;
    }

    @Override
    public void voice() {
        System.out.println("Собака говорит - \"Гав гав\".");
    }

    @Override
    public void eat(String food) {
        if (this.food.equals(food)) {
            System.out.println("Собака любит есть косточку \n");
        } else {
            System.out.println("Собака будет недовольна! \n");
        }
    }
}
