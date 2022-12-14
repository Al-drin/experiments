package org.example;

import java.util.Collections;
import java.util.LinkedList;

public class StringsRearranement {
    static boolean solution(String[] inputArray) {
        LinkedList<String> originalList = new LinkedList<>();

        Collections.addAll(originalList, inputArray);

        for (String word : inputArray) {
            LinkedList<String> newList = new LinkedList<>(originalList);
            newList.remove(word);
            if (recursiveOneChar(newList, word)) {
                return true;
            }
        }
        return false;
    }

    static boolean recursiveOneChar(LinkedList<String> words, String lastWord) {
        if (words.isEmpty()) {
            return true;
        }

        boolean check = false;

        for (String word : words) {
            if (oneCharDifference(word, lastWord)) {
                LinkedList<String> newList = new LinkedList<>(words);
                newList.remove(word);
                check = recursiveOneChar(newList, word);
            }

            if (check) {
                return true;
            }
        }

        return check;
    }

    static boolean oneCharDifference(String a, String b) {
        boolean diff = false;
        for (int i=0; i<a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                if (diff) {
                    return false;
                } else {
                    diff = true;
                }
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        //String[] a = new String[]{"ab","bb","aa"};
        String[] a = new String[]{"abc","bef","bcc","bec","bbc","bdc"};

        System.out.println(solution(a));
    }
}
