package com.buaa.operators;

import com.buaa.InvaildArgumentException;

public abstract class Operator {
    protected int[] parse(String string, String operator) {
        String[] strings = string.split("\\" + operator);
        int left = Integer.parseInt(strings[0]);
        int right = Integer.parseInt(strings[1]);
        return new int[] {left, right};
    }

    public abstract int calculate(String string);

    protected int parse(String string) {
        int result;
        try {
            result = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            throw new InvaildArgumentException(e.getMessage());
        }
        return result;
    }
}
