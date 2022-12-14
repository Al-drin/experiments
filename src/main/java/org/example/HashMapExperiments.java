package org.example;

import org.example.domain.Food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapExperiments {
    public static void main(String[] args) {
//        HashSet<Food> mySet = new HashSet<>();
//        Food food1 = new Food("chocolate");
//
//        mySet.add(food1);
//
//        System.out.println(mySet.contains(food1));
//        System.out.println(mySet);
//
//        food1.setName("beans");
//
//        System.out.println(mySet.contains(food1));
//        System.out.println(mySet);
//
//        food1.setName("chocolate");
//
//        System.out.println(mySet.contains(food1));
//        mySet.add(food1);
//
//        System.out.println(mySet.contains(food1));
//        System.out.println(mySet);
//
//        food1.setName("beans");
//
//        System.out.println(mySet.contains(food1));
//        System.out.println(mySet);
//
//        food1.setName("chocolate");
//
//        System.out.println(mySet.contains(food1));
//
        ArrayList<Food> myList = new ArrayList<>();
        Food food2 = new Food("chocolate");

        myList.add(food2);

        System.out.println(myList.contains(food2));
        System.out.println(myList);

        food2.setName("beans");

        System.out.println(myList.contains(food2));
        System.out.println(myList);

        food2.setName("chocolate");

        System.out.println(myList.contains(food2));
    }
}
