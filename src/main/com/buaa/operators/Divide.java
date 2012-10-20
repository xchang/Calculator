package com.buaa.operators;

public class Divide extends Operator {
    @Override
    public int calculate(String string) {
        int[] ints = parse(string, "/");
        return ints[0] / ints[1];
    }
}
