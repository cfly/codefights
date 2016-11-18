package org.caofei.codefights.arcade.codearcade.atthecrossroads;

import java.math.BigDecimal;

public class ArithmeticExpression {
    boolean arithmeticExpression(int A, int B, int C) {
        BigDecimal a = new BigDecimal(A);
        BigDecimal b = new BigDecimal(B);
        BigDecimal c = new BigDecimal(C);
        return a.add(b).equals(c) || a.subtract(b).equals(c) || a.multiply(b).equals(c) || c.multiply(b).equals(a);
    }
}
