package org.caofei.codefights.arcade.codearcade.introgates;

public class CircleOfNumbers {
    int circleOfNumbers(int n, int firstNumber) {
        return (firstNumber + (n >> 1)) % n;
    }
}
