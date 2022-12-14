package org.example;

import java.util.Arrays;

public class WhereWillTheBallFall {
    public static int[] findBall(int[][] grid) {
        int m = grid[0].length;
        int n = grid.length;

        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            result[i] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (result[j] < 0) {
                    continue;
                }
                // check if the ball falls down
                if (grid[i][result[j]] > 0) {
                    if (result[j] == m - 1) {
                        result[j] = -1;
                        continue;
                    }
                    if (grid[i][result[j] + 1] < 0) {
                        result[j] = -1;
                        continue;
                    }
                    result[j]++;
                } else {
                    if (result[j] == 0) {
                        result[j] = -1;
                        continue;
                    }
                    if (grid[i][result[j] - 1] > 0) {
                        result[j] = -1;
                        continue;
                    }
                    result[j]--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {1,1,1,-1,-1},
                {1,1,1,-1,-1},
                {-1,-1,-1,1,1},
                {1,1,1,1,-1},
                {-1,-1,-1,-1,-1}};

        System.out.println(Arrays.toString(findBall(grid)));
    }

}
