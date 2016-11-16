package org.caofei.codefights.arcade.codearcade.introgates;

public class LargestNumber {
    int largestNumber(int n) {
        switch (n) {
            case 1:
                return 9;
            case 2:
                return 99;
            case 3:
                return 999;
            case 4:
                return 9999;
            case 5:
                return 99999;
            case 6:
                return 999999;
            case 7:
                return 9999999;
        }
        return n;
    }
}
