package Homework7;

public class Surgeon extends Doctor{
    @Override
    public void heal() {
        super.heal("Хирург лечит!");
    }
}
