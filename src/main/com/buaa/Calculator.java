package com.buaa;

public class Calculator {
    public int eval(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new InvaildArgumentException(e.getMessage());
        }
    }
}
