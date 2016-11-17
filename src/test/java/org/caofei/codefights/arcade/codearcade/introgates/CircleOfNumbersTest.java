package org.caofei.codefights.arcade.codearcade.introgates;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleOfNumbersTest {
    @Test
    public void circleOfNumbers() throws Exception {
        CircleOfNumbers circleOfNumbers = new CircleOfNumbers();
        assertEquals(7, circleOfNumbers.circleOfNumbers(10, 2));
        assertEquals(2, circleOfNumbers.circleOfNumbers(10, 7));
        assertEquals(3, circleOfNumbers.circleOfNumbers(4, 1));
        assertEquals(0, circleOfNumbers.circleOfNumbers(6, 3));
    }

}