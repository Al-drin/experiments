package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) {
        List<String> myGirls1 = new ArrayList<>();
        myGirls1.add("Lola");
        myGirls1.add("Tola");
        myGirls1.add("Hela");

        String[] input = {"Lola", "Tola", "Hela"};

        List<String> myGirls2 = Arrays.stream(input).toList();

        List<String> myGirls3 = Stream.of("Lola", "Tola", "Hela").toList();

        System.out.println("Are those lists equal?");
        System.out.println(myGirls1.equals(myGirls2) && myGirls2.equals(myGirls3));

    }

}
