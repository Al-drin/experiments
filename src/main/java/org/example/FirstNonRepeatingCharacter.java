package org.example;

import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeatingCharacter {
    static char solution(String s) {
        Set<Character> repeats = new HashSet<>();
        boolean repeat;
        for (int i=0; i<s.length()-1; i++) {
            if (repeats.contains(s.charAt(i))) {
                continue;
            }
            repeat = false;
            for (int j=i+1; j<s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    repeats.add(s.charAt(i));
                    repeat = true;
                    break;
                }
            }
            if(!repeat) {
                return s.charAt(i);
            }
        }
        return '_';
    }

    public static void main(String[] args) {
        String a = "abacabaabacaba";

        System.out.println(solution(a));
    }
}
