package com.buaa;

public class Calculator {
    public int eval(String inputString) {
        String validString = inputString.replaceAll("\\s", "");

        if (validString.contains("+")){
            String[] strings = validString.split("\\+");
            int left = Integer.parseInt(strings[0]);
            int right = Integer.parseInt(strings[1]);
            return left + right;
        }
        try {
            return Integer.parseInt(validString);
        } catch (NumberFormatException e) {
            throw new InvaildArgumentException(e.getMessage());
        }
    }
}
