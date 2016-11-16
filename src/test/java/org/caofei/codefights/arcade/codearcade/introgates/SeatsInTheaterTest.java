package org.caofei.codefights.arcade.codearcade.introgates;

import org.caofei.codefights.arcade.codearcade.introgates.SeatsInTheater;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeatsInTheaterTest {
    @Test
    public void seatsInTheater() throws Exception {
        SeatsInTheater seatsInTheater = new SeatsInTheater();
        assertEquals(96, seatsInTheater.seatsInTheater(16, 11, 5, 3));
        assertEquals(0, seatsInTheater.seatsInTheater(1, 1, 1, 1));
        assertEquals(18, seatsInTheater.seatsInTheater(13, 6, 8, 3));
        assertEquals(99, seatsInTheater.seatsInTheater(60, 100, 60, 1));
        assertEquals(0, seatsInTheater.seatsInTheater(1000, 1000, 1000, 1000));
    }

}