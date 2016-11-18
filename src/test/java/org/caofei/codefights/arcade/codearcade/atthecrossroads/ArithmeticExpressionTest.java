package org.caofei.codefights.arcade.codearcade.atthecrossroads;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticExpressionTest {
    @Test
    public void arithmeticExpression() throws Exception {
        ArithmeticExpression arithmeticExpression = new ArithmeticExpression();
        assertEquals(true, arithmeticExpression.arithmeticExpression(2, 3, 5));
        assertEquals(true, arithmeticExpression.arithmeticExpression(8, 2, 4));
        assertEquals(false, arithmeticExpression.arithmeticExpression(8, 3, 2));
        assertEquals(true, arithmeticExpression.arithmeticExpression(6, 3, 3));
        assertEquals(true, arithmeticExpression.arithmeticExpression(8, 2, 4));
        assertEquals(true, arithmeticExpression.arithmeticExpression(2, 3, 6));
        assertEquals(false, arithmeticExpression.arithmeticExpression(5, 2, 0));
    }

}