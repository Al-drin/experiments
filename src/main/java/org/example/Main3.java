package org.example;

import org.example.domain.Food;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        List<Food> firstArray = new ArrayList<>();
        firstArray.add(new Food("First"));
        firstArray.add(new Food("Second"));

        List<Food> secondArray = firstArray.stream()
                .map(Food::new)
                .toList();

        secondArray.get(0).setName("MoreFirst");

        Food.setColor("BLUE");

        System.out.println(firstArray);
        System.out.println(secondArray);

        Map<String, Boolean> myMap = new HashMap<>();

        myMap.put("name", true);

        System.out.println(myMap);
    }
}
