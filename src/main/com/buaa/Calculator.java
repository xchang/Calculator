package com.buaa;

import com.buaa.operators.Add;
import com.buaa.operators.IOperator;
import com.buaa.operators.Minus;

public class Calculator {
    public int eval(String inputString) {
        String validString = inputString.replaceAll("\\s", "");
        int result = 0;
        IOperator operator;
        if (validString.contains("+")){
            operator = new Add();
            result = operator.calculate(validString);
        } else if (validString.contains("-")){
            operator = new Minus();
            result = operator.calculate(validString);
        } else {
            try {
                result = Integer.parseInt(validString);
            } catch (NumberFormatException e) {
                throw new InvaildArgumentException(e.getMessage());
            }
        }

        return result;
    }

}
