package com.mitrais.tdd.kata;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jchacana on 2/25/19.
 */
public class CalculatorTest {

    @Test
    public void testEmptyCase() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(0, calculator.add(""));
    }
    
    @Test
    public void testOneCase(){
    	Calculator calculator = new Calculator();
    	Assert.assertEquals(1, calculator.add("1"));
    }
}
