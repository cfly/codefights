package org.caofei.codefights.arcade.codearcade.introgates;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxMultipleTest {
    @Test
    public void maxMultiple() {
        MaxMultiple maxMultiple = new MaxMultiple();
        assertEquals(9, maxMultiple.maxMultiple(3, 10));
        assertEquals(6, maxMultiple.maxMultiple(2, 7));
        assertEquals(50, maxMultiple.maxMultiple(10, 50));
        assertEquals(98, maxMultiple.maxMultiple(7, 100));
    }

}