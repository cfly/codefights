package org.caofei.codefights.arcade.codearcade.atthecrossroads;

public class KnapsackLight {
    int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        if (weight1 + weight2 <= maxW) {
            return value1 + value2;
        }
        if (weight1 > maxW && weight2 > maxW) {
            return 0;
        }
        if (weight1 > maxW && weight2 <= maxW) {
            return value2;
        }
        if (weight1 <= maxW && weight2 > maxW) {
            return value1;
        }
        return Math.max(value1, value2);
    }
}
