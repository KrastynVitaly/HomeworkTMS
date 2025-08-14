package Homework__18.Task_Star;

import java.io.Reader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskStar {
    public static void main(String[] args) {
        List<Integer> sequence = Arrays.asList(1, 2, 5, 8, 9, 13);
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "1eman");
        myMap.put(2, "2eman");
        myMap.put(3, "3eman");
        myMap.put(4, "4eman");
        myMap.put(5, "5eman");
        myMap.put(6, "6eman");
        myMap.put(7, "7eman");
        myMap.put(8, "8eman");
        myMap.put(9, "9eman");
        myMap.put(10, "01eman");
        myMap.put(11, "11eman");
        myMap.put(12, "21eman");
        myMap.put(13, ".31eman");

        List<String> result = myMap.entrySet().parallelStream().
                filter((i) -> sequence.contains(i.getKey()) && i.getValue().length() % 2 != 0).
                map(Map.Entry::getValue).map(name -> new StringBuilder(name).reverse().toString())
                .toList();
        System.out.println(result);
    }

}
