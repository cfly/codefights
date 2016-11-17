package org.caofei.codefights.arcade.codearcade.introgates;

public class LateRide {
    int lateRide(int n) {
        int hh = n / 60;
        int mm = n % 60;
        return hh / 10 + hh % 10 + mm / 10 + mm % 10;
    }
}
