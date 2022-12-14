package org.example;

public class CheckIfTwoStringArraysAreEquivalent {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }

    public static boolean arrayStringsAreEqual1(String[] word1, String[] word2) {
        int wordIdx1 = 0;
        int wordIdx2 = 0;
        int chIdx1 = 0;
        int chIdx2 = 0;

        while(wordIdx1 < word1.length && wordIdx2 < word2.length)
        {
            char ch1 = word1[wordIdx1].charAt(chIdx1);
            char ch2 = word2[wordIdx2].charAt(chIdx2);

            if (ch1 != ch2) {
                return false;
            }

            chIdx1++;
            chIdx2++;

            if (chIdx1 == word1[wordIdx1].length())
            {
                wordIdx1++;
                chIdx1 = 0;
            }
            if (chIdx2 == word2[wordIdx2].length())
            {
                wordIdx2++;
                chIdx2 = 0;
            }
        }

        return wordIdx1 == word1.length && wordIdx2 == word2.length;
    }

    public static void main(String[] args) {
        String[] word1 = new String[]{"ab", "c"};
        String[] word2 = new String[]{"a", "bc"};

        System.out.println(arrayStringsAreEqual1(word1, word2));
    }
}
