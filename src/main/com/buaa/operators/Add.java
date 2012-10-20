package com.buaa.operators;

public class Add implements IOperator {

    @Override
    public int calculate(String string) {
        String[] strings = string.split("\\+");
        int left = Integer.parseInt(strings[0]);
        int right = Integer.parseInt(strings[1]);
        return left + right;
    }
}
