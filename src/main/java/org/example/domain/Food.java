package org.example.domain;

import java.util.Objects;

public class Food {
    private String name;
    private static String color = "RED";

    public Food(String name) {
        this.name = name;
    }

    public Food(Food food) {
        this.name = food.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Food.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food food)) return false;

        return Objects.equals(name, food.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                "color='" + color + '\'' +
                '}';
    }
}
