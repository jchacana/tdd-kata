package com.mitrais.tdd.kata;

/**
 * Created by jchacana on 7/26/19.
 */
public class Calculator {

    public int add(String s) {
        if("".equalsIgnoreCase(s)) return 0;
        return Integer.valueOf(s);
    }
}
