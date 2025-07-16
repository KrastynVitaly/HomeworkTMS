package Homework_8;

public class DogFabric extends Animal {
    private final String food;
    private String name;

    private DogFabric(String name, String food) {
        this.name = name;
        this.food = food;
    }

    public static DogFabric getDog(String name, String food) {
        return new DogFabric(name, food);
    }

    @Override
    public void voice() {
        System.out.println("Собака говорит - \"Гав гав\".");
    }

    @Override
    public void eat(String food) {
        if (this.food.equals(food)) {
            System.out.println("Собака " + this.name + " любит есть косточку \n");
        } else {
            System.out.println("Собака " + this.name + " будет недовольна! \n");
        }
    }
}