package org.example;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String a = String.valueOf(x);

        String left = a.substring(0, a.length()/2);
        String right = a.substring(a.length()/2 + a.length()%2);

        return left.equals(new StringBuilder(right).reverse().toString());
    }

    public static void main(String[] args) {
        int x1 = 123;
        int x2 = 121;

        System.out.println(isPalindrome(x1));
        System.out.println(isPalindrome(x2));
    }
}
