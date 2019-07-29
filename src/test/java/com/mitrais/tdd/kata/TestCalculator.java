package com.mitrais.tdd.kata;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jchacana on 3/26/19.
 */
public class TestCalculator {

    @Test
    public void testEmpty() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(Integer.valueOf(0), calculator.add(""));
    }

    @Test
    public void testOneNumberOne() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(Integer.valueOf(1), calculator.add("1"));
    }

    @Test
    public void testOneNumberTwo() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(Integer.valueOf(2), calculator.add("2"));
    }
}
