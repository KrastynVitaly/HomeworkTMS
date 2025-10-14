package Homework__16.Task_2;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String[] pairs = {"man", "moon", "good", "night", "code", "bug"};
        Map<String,String> map = new HashMap<>();
        for (String str : pairs) {
            String first = String.valueOf(str.charAt(0));
            String last = String.valueOf(str.charAt(str.length() - 1));
            map.put(first, last);
        }
        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
