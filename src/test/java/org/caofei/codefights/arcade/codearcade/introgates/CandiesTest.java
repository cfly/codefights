package org.caofei.codefights.arcade.codearcade.introgates;

import org.caofei.codefights.arcade.codearcade.introgates.Candies;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandiesTest {
    @Test
    public void candies() throws Exception {
        Candies candies = new Candies();
        assertEquals(9, candies.candies(3, 10));
        assertEquals(2, candies.candies(1, 2));
    }

}