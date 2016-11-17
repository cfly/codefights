package org.caofei.codefights.arcade.codearcade.atthecrossroads;

public class IsInfiniteProcess {
    boolean isInfiniteProcess(int a, int b) {
        return a > b || (a + b) % 2 != 0;
    }
}
