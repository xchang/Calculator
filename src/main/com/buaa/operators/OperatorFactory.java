package com.buaa.operators;

public class OperatorFactory {
    public static Operator createOperator(String validString) {
        Operator operator;
        if (validString.contains("+")){
            operator = new Add();
        } else if (validString.contains("-")){
            operator = new Minus();
        }else if (validString.contains("*")){
            operator = new Multiply();
        } else {
            operator = new Parser();
        }
        return operator;
    }
}
