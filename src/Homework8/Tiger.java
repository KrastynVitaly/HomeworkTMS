package Homework8;

public class Tiger extends Animal {
    private final String food;

    public Tiger(String food) {
        this.food = food;
    }

    @Override
    public void voice() {
        System.out.println("Тигр говорит - \"Рррррр\".");
    }

    @Override
    public void eat(String food) {
        if (this.food.equals(food)) {
            System.out.println("Тигр любит есть мясо \n");
        } else {
            System.out.println("Тигр будет недоволен! \n");
        }
    }
}
