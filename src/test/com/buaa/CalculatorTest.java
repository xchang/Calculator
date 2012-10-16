package com.buaa;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void should_parse_string_to_integer(){
        Calculator calculator = new Calculator();
        int result = calculator.eval("123");
        Assert.assertEquals(123, result);
        result = calculator.eval("12345");
        Assert.assertEquals(12345, result);
    }

    @Test (expected = InvaildArgumentException.class)
    public void should_throw_exception_when_input_is_not_a_number(){
        Calculator calculator = new Calculator();
        calculator.eval("abc");
    }
}
