package org.caofei.codefights.arcade.codearcade.introgates;

import org.caofei.codefights.arcade.codearcade.introgates.LargestNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class LargestNumberTest {
    @Test
    public void largestNumber() throws Exception {
        LargestNumber largestNumber = new LargestNumber();
        assertEquals(99, largestNumber.largestNumber(2));
        assertEquals(9, largestNumber.largestNumber(1));
    }
}