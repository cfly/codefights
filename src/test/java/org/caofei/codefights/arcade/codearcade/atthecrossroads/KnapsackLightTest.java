package org.caofei.codefights.arcade.codearcade.atthecrossroads;

import org.junit.Test;

import static org.junit.Assert.*;

public class KnapsackLightTest {
    @Test
    public void knapsackLight() throws Exception {
        KnapsackLight knapsackLight = new KnapsackLight();
        assertEquals(10, knapsackLight.knapsackLight(10, 5, 6, 4, 8));
        assertEquals(16, knapsackLight.knapsackLight(10, 5, 6, 4, 9));
        assertEquals(0, knapsackLight.knapsackLight(10, 2, 11, 3, 1));
        assertEquals(15, knapsackLight.knapsackLight(15, 2, 20, 3, 2));
        assertEquals(3, knapsackLight.knapsackLight(2, 5, 3, 4, 5));
        assertEquals(4, knapsackLight.knapsackLight(4, 3, 3, 4, 4));
        assertEquals(3, knapsackLight.knapsackLight(3, 5, 3, 8, 10));
    }

}