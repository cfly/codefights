package org.caofei.codefights.arcade.codearcade.atthecrossroads;

import java.util.Arrays;

public class TennisSet {
    boolean tennisSet(int score1, int score2) {
        int[] s = {score1, score2};
        Arrays.sort(s);
        if (s[0] < 5 && s[1] == 6) {
            return true;
        }
        if (s[0] == 7 && s[1] == 7) {
            return false;
        }
        if (s[0] >= 5 && s[1] >= 5 && s[1] == 7) {
            return true;
        }
        return false;
    }
}
