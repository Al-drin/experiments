package org.example;

public class SmallestStringWithAGivenNumericValue {

    public static String getSmallestString(int n, int k) {
        k -= n;
        char[] result = new char[n];
        int pos = n - 1;

        while (k >= 'z' - 'a') {
            result[pos] = 'z';
            pos--;
            k -= 'z' - 'a';
        }

        if(pos >= 0) {
            result[pos] = (char) ('a' + k);
            pos--;
            while (pos >= 0) {
                result[pos] = 'a';
                pos--;
            }
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println("Value between 'a' and 'z': " + ('z'-'a'));
        System.out.println("Value between 'a' and 'b': " + ('b'-'a'));

        System.out.println("Smallest string n=5 k=43: " + getSmallestString(5,43));
    }

}
