package Homework__11.Task_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class WorkWithStrings {
    String firstValue;
    String secondValue;
    String thirdValue;

    public WorkWithStrings(String firstValue, String secondValue, String thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public void minLengthOfString(String firstValue, String secondValue, String thirdValue){
        if (firstValue.length() < secondValue.length() && firstValue.length() < thirdValue.length()) {
            System.out.println("Самая короткая строка : " + firstValue);
        } else if (secondValue.length() < firstValue.length() && secondValue.length() < thirdValue.length()) {
            System.out.println("Самая короткая строка : " + secondValue);
        }else {
            System.out.println("Самая короткая строка : " + thirdValue);
        }
    }
    public void maxLengthOfString(String firstValue, String secondValue, String thirdValue) {
        if (firstValue.length() > secondValue.length() && firstValue.length() > thirdValue.length()) {
            System.out.println("Самая длинная строка : " + firstValue);
        } else if (secondValue.length() > firstValue.length() && secondValue.length() > thirdValue.length()) {
            System.out.println("Самая длинная строка : " + secondValue);
        } else {
            System.out.println("Самая длинная строка : " + thirdValue);
        }
    }

//    public void sortStrings(String firstValue, String secondValue, String thirdValue) {
//        String[] arrayOfStrings = {firstValue, secondValue, thirdValue};
//        Arrays.sort(arrayOfStrings, Comparator.comparingInt(String::length));
//        for (outputValue:arrayOfStrings;) {
//            System.out.println(outputValue);
        }

