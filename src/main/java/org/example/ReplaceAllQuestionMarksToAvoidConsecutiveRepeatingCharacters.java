package org.example;

public class ReplaceAllQuestionMarksToAvoidConsecutiveRepeatingCharacters {
    public static String modifyString(String s) {
        int questionMarkIndex = s.indexOf('?');

        while (questionMarkIndex >= 0) {
            char proposedChar = 'a';

            if (s.indexOf(proposedChar) < 0) {
                s = s.replaceFirst("[?]", ""+proposedChar);
                questionMarkIndex = s.indexOf('?');
                continue;
            }

            if (questionMarkIndex == 0) {
                if (proposedChar == s.charAt(1)) {
                    proposedChar++;
                }

                s = s.replaceFirst("[?]", ""+proposedChar);
                questionMarkIndex = s.indexOf('?');
                continue;
            }

            if (questionMarkIndex == s.length()-1) {
                if (proposedChar == s.charAt(s.length()-2)) {
                    proposedChar++;
                }

                s = s.replaceFirst("[?]", ""+proposedChar);
                questionMarkIndex = s.indexOf('?');
                continue;
            }

            while (s.charAt(questionMarkIndex + 1) == proposedChar ||
                    s.charAt(questionMarkIndex - 1) == proposedChar) {
                proposedChar++;
            }

            s = s.replaceFirst("[?]", ""+proposedChar);
            questionMarkIndex = s.indexOf('?');
        }

        return s;
    }

    public static void main(String[] args) {
        String someString = "?as";
        String someString1 = "j?qg??b";
        String someString2 = "??yw?ipkj?";

        //System.out.println(modifyString(someString));
        //System.out.println(modifyString(someString1));
        System.out.println(modifyString(someString2));
    }
}
