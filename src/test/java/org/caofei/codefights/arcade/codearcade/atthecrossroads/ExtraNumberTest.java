package org.caofei.codefights.arcade.codearcade.atthecrossroads;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExtraNumberTest {
    @Test
    public void extraNumber() throws Exception {
        ExtraNumber extraNumber = new ExtraNumber();
        assertEquals(7, extraNumber.extraNumber(2, 7, 2));
        assertEquals(3, extraNumber.extraNumber(3, 2, 2));
        assertEquals(1, extraNumber.extraNumber(5, 5, 1));
        assertEquals(3, extraNumber.extraNumber(500000000, 3, 500000000));
    }

}