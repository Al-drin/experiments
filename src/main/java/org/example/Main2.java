package org.example;

import org.example.domain.Food;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Food> foodList = new ArrayList<>(List.of(new Food("pancakes"), new Food("pork chops")));

        //this is fine
        foodList.get(0).getName();

        System.out.println(foodList.get(0).getName());

        List<Object> objectList = new ArrayList<>(foodList);

        //this is not fine
        //objectList.get(0).getName();

    }
}
