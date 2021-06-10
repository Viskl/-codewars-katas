package com.company.exesAndOhs;

public class XO {

    public static boolean getXO(String str) {

        char[] charArr = str.toCharArray();

        int xCounter = 0;
        int oCounter = 0;

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == 'x') {
                xCounter++;
            }
            if (charArr[i] == 'o') {
                oCounter++;
            }
        }

        boolean isEqual = false;

        if (xCounter == oCounter) {
            isEqual = true;
        }

        return isEqual;
    }

}
