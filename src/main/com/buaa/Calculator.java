package com.buaa;

import com.buaa.operators.*;

public class Calculator {
    public int eval(String inputString) {
        String validString = removeSpace(inputString);
        Operator operator = OperatorFactory.createOperator(validString);
        return operator.calculate(validString);
    }

    private String removeSpace(String inputString) {
        return inputString.replaceAll("\\s", "");
    }
}
