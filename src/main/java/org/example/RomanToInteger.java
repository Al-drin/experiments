package org.example;

public class RomanToInteger {
    public static int romanToInt(String s) {
        char[] charArray = s.toCharArray();

        int sum = 0;
        int num;

        for (int i=0; i < charArray.length - 1; i++) {
            num = romanCharToInt(charArray[i]);

            if (num < romanCharToInt(charArray[i+1])) {
                sum -= num;
            } else {
                sum += num;
            }
        }

        return sum + romanCharToInt(charArray[charArray.length-1]);
    }

    public static int romanCharToInt(char a) {
        return switch (a) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        String romanNumber1 = "III";
        String romanNumber2 = "LVIII";
        String romanNumber3 = "MCMXCIV";

        System.out.println(romanToInt(romanNumber1));
        System.out.println(romanToInt(romanNumber2));
        System.out.println(romanToInt(romanNumber3));

    }
}
