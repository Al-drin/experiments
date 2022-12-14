package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ValidParentheses {
    public static boolean isValid(String s) {
//        Map<Character, Integer> charMap = new HashMap<>();
//
//        for (int i=0; i < s.length(); i++) {
//            charMap.merge(s.charAt(i), 1, Integer::sum);
//        }
//
//        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
//            if (entry.getKey() == '(' && !entry.getValue().equals(charMap.get(')'))) {
//                return false;
//            }
//            if (entry.getKey() == '{' && !entry.getValue().equals(charMap.get('}'))) {
//                return false;
//            }
//            if (entry.getKey() == '[' && !entry.getValue().equals(charMap.get(']'))) {
//                return false;
//            }
//        }
//
//        return true;
        LinkedList<Character> charList = new LinkedList<>();
        Character c;

        for (int i=0; i < s.length(); i++) {
            c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                charList.add(c);
                continue;
            }

            switch (c) {
                case ')' -> c = '(';
                case '}' -> c = '{';
                case ']' -> c = '[';
            }

            if (!Objects.equals(charList.removeLast(), c)) {
                return false;
            }
        }

        return charList.isEmpty();

    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";

        System.out.println("String: " + s1);
        System.out.println("Output: " + isValid(s1));
        System.out.println("String: " + s2);
        System.out.println("Output: " + isValid(s2));
        System.out.println("String: " + s3);
        System.out.println("Output: " + isValid(s3));

        Integer i = 123;

        i.toString().toCharArray();
    }
}
