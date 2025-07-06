package Homework7;

public class Dentist extends Doctor{
    @Override
    public void heal() {
        super.heal("Дантист лечит!");
    }
}
