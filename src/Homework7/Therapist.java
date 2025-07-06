package Homework7;

public class Therapist extends Doctor {
    @Override
    public void heal(String message) {
        super.heal("Терапевт лечит!");
    }
}
