package org.caofei.codefights.arcade.codearcade.introgates;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneCallTest {
    @Test
    public void phoneCall() throws Exception {
        PhoneCall phoneCall = new PhoneCall();
        assertEquals(14, phoneCall.phoneCall(3, 1, 2, 20));
        assertEquals(1, phoneCall.phoneCall(2, 2, 1, 2));
        assertEquals(11, phoneCall.phoneCall(10, 1, 2, 22));
        assertEquals(14, phoneCall.phoneCall(2, 2, 1, 24));
        assertEquals(3, phoneCall.phoneCall(1, 2, 1, 6));
    }

}