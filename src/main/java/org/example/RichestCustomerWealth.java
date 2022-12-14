package org.example;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {

        return Arrays.stream(accounts)
                .mapToInt(el -> Arrays.stream(el).sum()).max().orElseThrow();
    }

    public static void main(String[] args) {
        int[][] data = new int[][]{{1,2,3},
                                   {3,2,1}};

        System.out.println("Richest maximum wealth: " + maximumWealth(data));
    }
}
