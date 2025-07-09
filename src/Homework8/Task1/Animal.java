package Homework8.Task1;

public abstract class Animal {
    private String food;

    protected Animal() {
    }

    public Animal(String food) {
        this.food = food;
    }


    public abstract void voice();

    public abstract void eat(String food);
}
