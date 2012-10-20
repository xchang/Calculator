package com.buaa.operators;

public class Parser extends Operator {

    @Override
    public int calculate(String string) {
        int result = parse(string);
        return result;
    }

}
