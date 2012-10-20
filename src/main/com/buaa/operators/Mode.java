package com.buaa.operators;

public class Mode extends Operator {
    @Override
    public int calculate(String string) {
        int[] ints = parse(string, "%");
        return ints[0] % ints[1];
    }
}
