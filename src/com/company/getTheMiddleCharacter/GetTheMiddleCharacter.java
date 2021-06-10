package com.company.getTheMiddleCharacter;

public class GetTheMiddleCharacter {

    public static String getMiddle(String word) {
        char[] charArr = word.toCharArray();
        int wordLength = word.length();
        String result;

        if (wordLength % 2 == 0) {
            result = charArr[(wordLength / 2) - 1] + String.valueOf(charArr[wordLength / 2]);
        } else {
            result = String.valueOf(charArr[wordLength/2]);
        }

        return result;
    }

}
