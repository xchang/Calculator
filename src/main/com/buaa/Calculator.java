package com.buaa;

public class Calculator {
    public int eval(String s) {
        try {
            ∂

            int result = Integer.parseInt(s);
            return result;
        } catch (NumberFormatException e) {
            throw new InvaildArgumentException(e.getMessage());
        }
    }
}
