package org.example;

public class IsCryptSolution {
    static boolean solution(String[] crypt, char[][] solution) {
        //building char arrays
        char[][] resultChars = new char[3][];

        for (int i=0; i<crypt.length; i++) {
            resultChars[i] = new char[crypt[i].length()];
            for (int j=0; j<crypt[i].length(); j++) {
                for (char[] pair : solution) {
                    if (crypt[i].charAt(j) == pair[0]) {
                        resultChars[i][j] = pair[1];
                        break;
                    }
                }
            }
            if (resultChars[i][0] == '0') {
                return false;
            }
        }

        int[] resultInt = new int[3];
        int multiplier;

        for (int i=0; i<resultChars.length; i++) {
            multiplier = 1;
            for (int j=0; j<resultChars[i].length; j++) {
                resultInt[i] += Character.getNumericValue(resultChars[i][resultChars[i].length-1-j]) * multiplier;
                multiplier *= 10;
            }
        }

        return resultInt[0] + resultInt[1] == resultInt[2];
    }

    public static void main(String[] args) {
        String[] crypt = new String[]{"SEND", "MORE", "MONEY"};

        char[][] solution = new char[][]{
                {'O', '0'},
                {'M', '1'},
                {'Y', '2'},
                {'E', '5'},
                {'N', '6'},
                {'D', '7'},
                {'R', '8'},
                {'S', '9'}
        };

        System.out.println(solution(crypt,solution));
    }
}
