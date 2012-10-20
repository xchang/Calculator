package com.buaa.operators;

public class Add extends Operator {

    @Override
    public int calculate(String string) {
        int[] numbers = parse(string, "+");
        return numbers[0] + numbers[1];
    }
}
