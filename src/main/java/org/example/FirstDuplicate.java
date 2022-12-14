package org.example;

import java.util.HashMap;
import java.util.Map;

public class FirstDuplicate {
    static int solution(int[] a) {
        if (a.length < 2) {
            return -1;
        }

        Map<Integer, Integer> results = new HashMap<>();

        for (int i=0; i<a.length-1; i++) {
            for (int j=i+1; j<a.length; j++) {
                if (a[i] == a[j]) {
                    results.put(j, a[j]);
                }
            }
        }

        if (results.isEmpty()) {
            return -1;
        }

        return results.get(results.keySet().stream().min(Integer::compare).get());
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,1,3,5,3,2};

        System.out.println(solution(a));
    }
}
