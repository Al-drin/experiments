package org.example;

public class RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        if (p.length() == 1) {
            if (p.equals(".") && s.length() == 1) {
                return true;
            }

            return p.equals(s);
        }

        int i = s.length()-1;
        int j = p.length()-1;

        while (i > 0 && j > 0) {
            if (p.charAt(j) == '.') {
                i--;
                j--;
                continue;
            }
            if (p.charAt(j) == '*') {
                if (p.charAt(j-1) == '.') {

                }
            }
        }

        if (i == 0 && j == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "aa";
        String p = "a";
    }
}
