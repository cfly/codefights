package org.caofei.codefights.arcade.codearcade.atthecrossroads;

import org.junit.Test;

import static org.junit.Assert.*;

public class WillYouTest {
    @Test
    public void willYou() throws Exception {
        WillYou willYou = new WillYou();
        assertEquals(false, willYou.willYou(true, true, true));
        assertEquals(true, willYou.willYou(true, false, true));
        assertEquals(false, willYou.willYou(false, false, false));
        assertEquals(true, willYou.willYou(false, false, true));
    }

}