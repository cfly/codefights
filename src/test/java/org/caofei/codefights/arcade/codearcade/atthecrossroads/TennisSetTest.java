package org.caofei.codefights.arcade.codearcade.atthecrossroads;

import org.junit.Test;

import static org.junit.Assert.*;

public class TennisSetTest {
    @Test
    public void tennisSet() throws Exception {
        TennisSet tennisSet = new TennisSet();
        assertEquals(true, tennisSet.tennisSet(3, 6));
        assertEquals(false, tennisSet.tennisSet(8, 5));
        assertEquals(false, tennisSet.tennisSet(6, 5));
        assertEquals(false, tennisSet.tennisSet(7, 7));
        assertEquals(true, tennisSet.tennisSet(6, 4));
        assertEquals(true, tennisSet.tennisSet(7, 5));
        assertEquals(false, tennisSet.tennisSet(7, 2));
        assertEquals(true, tennisSet.tennisSet(7, 6));
    }
}