package org.example;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strings) {
        char currentChar;
        StringBuilder prefix = new StringBuilder();

        for (int i=0; i < strings[0].length(); i++) {
            currentChar = strings[0].charAt(i);

            for (int j=1; j < strings.length; j++) {
                if (i == strings[j].length()) {
                    return prefix.toString();
                }
                if (currentChar != strings[j].charAt(i)) {
                    return prefix.toString();
                }
            }

            prefix.append(currentChar);
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
        String[] strings1 = {"flower","flow","flight"};

        System.out.println("Strings: " + Arrays.toString(strings1));
        System.out.println("Prefix: " + longestCommonPrefix(strings1));

        String[] strings2 = {"dog","racecar","car"};

        System.out.println("Strings: " + Arrays.toString(strings2));
        System.out.println("Prefix: " + longestCommonPrefix(strings2));

    }
}
