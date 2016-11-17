package org.caofei.codefights.arcade.codearcade.introgates;

import org.junit.Test;

import static org.junit.Assert.*;

public class LateRideTest {
    @Test
    public void lateRide() throws Exception {
        LateRide lateRide = new LateRide();
        assertEquals(4, lateRide.lateRide(240));
        assertEquals(14, lateRide.lateRide(808));
        assertEquals(19, lateRide.lateRide(1439));
        assertEquals(0, lateRide.lateRide(0));
        assertEquals(5, lateRide.lateRide(23));
        assertEquals(8, lateRide.lateRide(8));
    }

}