package com.company.exesAndOhs;

public class XO {

    public static boolean getXO(String str) {

        char[] charArr = str.toCharArray();

        int xCounter = 0;
        int oCounter = 0;

        for (char c : charArr) {
            if (c == 'x') {
                xCounter++;
            }
            if (c == 'o') {
                oCounter++;
            }
        }

        return xCounter == oCounter;
    }

}
