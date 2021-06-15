package com.company.codewars;

import java.util.Locale;

public class JadenCase {
    public static String toJadenCase(String phrase) {
        if (phrase == null) {
            return null;
        }
        if (phrase.equals("")) {
            return null;
        }
        String[] words = phrase.split(" ");
        String upperCasedPhrase ="";

        for(String word: words) {
            String upperCasedWord = word.substring(0,1).toUpperCase() +  word.substring(1,word.length());
            upperCasedPhrase += upperCasedWord + " ";
        }
        upperCasedPhrase = upperCasedPhrase.substring(0,upperCasedPhrase.length() - 1);
        return upperCasedPhrase;
    }


}