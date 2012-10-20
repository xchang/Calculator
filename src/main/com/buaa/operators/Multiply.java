package com.buaa.operators;

public class Multiply extends Operator {
    @Override
    public int calculate(String string) {
        int[] numbers = parse(string, "*");
        return numbers[0] * numbers[1];
    }
}
