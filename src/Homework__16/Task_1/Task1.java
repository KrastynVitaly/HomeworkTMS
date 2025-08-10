package Homework__16.Task_1;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        String[] wordMultiple = {"c", "c", "c", "c"};
        HashMap<String, Boolean> map = new HashMap();

        for (String word : wordMultiple) {
            if (map.containsKey(word)) {
                map.replace(word, true);
            } else {
                map.put(word, false);
            }
        }
        System.out.println(map);
    }
}
