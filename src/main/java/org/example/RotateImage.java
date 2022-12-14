package org.example;

import java.util.Arrays;

public class RotateImage {
    static int[][] solution(int[][] a) {
        int b;
        for (int i=0; i<(a.length+1)/2; i++) {
            for (int j=i; j<a.length-1-i; j++) {
                b = a[i][j];
                a[i][j] = a[a.length-1-j][i];
                a[a.length-1-j][i] = a[a.length-1-i][a.length-1-j];
                a[a.length-1-i][a.length-1-j] = a[j][a.length-1-i];
                a[j][a.length-1-i] = b;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 2, 3, 4},
                                {5, 6, 7, 8},
                                {9, 10,11,12},
                                {13,14,15,16}};

        for (int[] res : solution(a)) {
            System.out.println(Arrays.toString(res));
        }
    }
}
