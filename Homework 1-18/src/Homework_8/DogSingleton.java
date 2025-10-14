package Homework_8;

public class DogSingleton extends Animal {
    private static String FOOD;
    private static String NAME;
    private static DogSingleton INSTANCE;

    private DogSingleton(String name, String food) {
        NAME = name;
        FOOD = food;
    }

    public static DogSingleton getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new DogSingleton("Singleton", "bone");
        }
        return INSTANCE;
    }

    @Override
    public void voice() {
        System.out.println("Собака говорит - \"Гав гав\".");
    }

    @Override
    public void eat(String food) {
        if (FOOD.equals(food)) {
            System.out.println("Собака " + NAME + " любит есть косточку \n");
        } else {
            System.out.println("Собака " + NAME + " будет недовольна! \n");
        }
    }
}
