package org.caofei.codefights.arcade.codearcade.introgates;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTwoDigitsTest {
    @Test
    public void addTwoDigits() throws Exception {
        AddTwoDigits addTwoDigits = new AddTwoDigits();
        assertEquals(11, addTwoDigits.addTwoDigits(29));
        assertEquals(12, addTwoDigits.addTwoDigits(48));
        assertEquals(1, addTwoDigits.addTwoDigits(10));
        assertEquals(7, addTwoDigits.addTwoDigits(25));
    }

}