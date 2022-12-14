package org.example;

public class ToeplitzMatrix {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // test horizontal
        int i = 0; // offset
        int j = 1;
        int x; //value

        while (i < n-1) {
            x = matrix[0][i];
            while (j < m && i + j < n) {
                if (matrix[j][i + j] != x) {
                    return false;
                }
                j++;
            }

            i++;
            j = 1;
        }

        // test vertical
        i = 1;
        while (i < m-1) {
            x = matrix[i][0];
            while (i + j < m && j < n) {
                if (matrix[i + j][j] != x) {
                    return false;
                }
                j++;
            }

            i++;
            j = 1;
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,2,3,4},
                {5,1,2,3},
                {9,5,1,2}};

        int[][] matrix1 = new int[][]{
                {41,45},
                {81,41},
                {73,81},
                {47,73},
                {76,47},
                {79,76}};

        //System.out.println(isToeplitzMatrix(matrix));
        System.out.println(isToeplitzMatrix(matrix1));
    }
}
