package org.caofei.codefights.arcade.codearcade.atthecrossroads;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsInfiniteProcessTest {
    @Test
    public void isInfiniteProcess() throws Exception {
        IsInfiniteProcess isInfiniteProcess = new IsInfiniteProcess();
        assertEquals(false, isInfiniteProcess.isInfiniteProcess(2, 6));
        assertEquals(true, isInfiniteProcess.isInfiniteProcess(2, 3));
        assertEquals(false, isInfiniteProcess.isInfiniteProcess(2, 10));
        assertEquals(true, isInfiniteProcess.isInfiniteProcess(0, 1));
        assertEquals(true, isInfiniteProcess.isInfiniteProcess(3, 1));
        assertEquals(false, isInfiniteProcess.isInfiniteProcess(10, 10));
    }

}