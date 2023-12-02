package com.example.mipt03;

import static org.junit.Assert.assertEquals;

import com.itis.libs.parserng.android.expressParser.MathExpression;

import org.junit.Test;

public class UnitTestParserWorks {
    @Test
    public void parserAddition(){
        String expectedResult = "4.0";
        String givenExpression = "2+2";

        MathExpression expression = new MathExpression(givenExpression);
        String actualResult = expression.solve();

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void parserSubtraction(){
        String expectedResult = "4.0";
        String givenExpression = "6-2";

        MathExpression expression = new MathExpression(givenExpression);
        String actualResult = expression.solve();

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void parserDivision(){
        String expectedResult = "4.0";
        String givenExpression = "8/2";

        MathExpression expression = new MathExpression(givenExpression);
        String actualResult = expression.solve();

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void parserMultiplication(){
        String expectedResult = "4.0";
        String givenExpression = "2*2";

        MathExpression expression = new MathExpression(givenExpression);
        String actualResult = expression.solve();

        assertEquals(expectedResult, actualResult);
    }
}
