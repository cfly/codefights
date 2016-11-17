package org.caofei.codefights.arcade.codearcade.atthecrossroads;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReachNextLevelTest {
    @Test
    public void reachNextLevel() throws Exception {
        ReachNextLevel reachNextLevel = new ReachNextLevel();
        assertEquals(true, reachNextLevel.reachNextLevel(10, 15, 5));
        assertEquals(false, reachNextLevel.reachNextLevel(10, 15, 4));
        assertEquals(true, reachNextLevel.reachNextLevel(3, 6, 4));
    }
}