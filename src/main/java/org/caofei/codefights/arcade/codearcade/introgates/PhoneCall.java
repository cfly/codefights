package org.caofei.codefights.arcade.codearcade.introgates;

public class PhoneCall {
    int phoneCall(int min1, int min2_10, int min11, int s) {
        int v1 = min1 * 1;
        int v2 = min2_10 * 9 + v1;
        if (s < v1) {
            return 0;
        }
        if (s >= v1 && s < v2) {
            return (s - v1) / min2_10 + 1;
        }
        if (s >= v2) {
            return (s - v2) / min11 + 10;
        }
        return 0;
    }
}
