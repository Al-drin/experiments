package org.example;

import java.util.HashSet;
import java.util.Set;

public class Sudoku2 {
    boolean solution(char[][] grid) {

        Set<Character> numbers = new HashSet<>();

        //check lines
        for (char[] line : grid) {
            numbers.clear();
            for (char c : line) {
                if (c >= '1' && c <= '9') {
                    if (!numbers.add(c)) {
                        return false;
                    }
                }
            }
        }

        //check columns
        for (int i=0; i<grid.length; i++) {
            numbers.clear();
            for (int j=0; j<grid.length; j++) {
                if (grid[j][i] >= '1' && grid[j][i] <= '9') {
                    if (!numbers.add(grid[j][i])) {
                        return false;
                    }
                }
            }
        }

        //check blocks
        for (int x=0; x<9; x+=3) {
            for (int y=0; y<9; y+=3) {
                numbers.clear();

                for (int i=x; i<x+3; i++) {
                    for (int j=y; j<y+3; j++) {
                        if (grid[i][j] >= '1' && grid[i][j] <= '9') {
                            if (!numbers.add(grid[i][j])) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
