package Homework_7;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Patient patient1 = new Patient(1);
        Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(333);

        Therapist therapist = new Therapist();

        therapist.changeDoctor(patient1);
        therapist.changeDoctor(patient2);
        therapist.changeDoctor(patient3);

        Apple apple = new Apple();

        Class<?> appleClass = apple.getClass();

        Field colorField = appleClass.getDeclaredField("color");
        colorField.setAccessible(true);
        colorField.set(apple, "Green");

        Method printColorMethod = appleClass.getDeclaredMethod("printColor");
        printColorMethod.setAccessible(true);
        printColorMethod.invoke(apple);

    }
}

