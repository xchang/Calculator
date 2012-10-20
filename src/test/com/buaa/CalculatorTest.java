package com.buaa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void should_parse_string_to_integer(){
        int result = calculator.eval("123");
        Assert.assertEquals(123, result);
        result = calculator.eval("12345");
        Assert.assertEquals(12345, result);
    }

    @Test (expected = InvaildArgumentException.class)
    public void should_throw_exception_when_input_is_not_a_number(){
        calculator.eval("abc");
    }

    @Test
    public void should_eval_add_operation() {
        int result = calculator.eval("3+2");
        Assert.assertEquals(5, result);
    }

    @Test
    public void should_trim_empty_space() {
        int result = calculator.eval(" 3 + 2 ");
        Assert.assertEquals(5, result);
    }

    @Test
    public void should_eval_minus_operation() {
        int result = calculator.eval("12-9");
        Assert.assertEquals(3, result);
    }

    @Test
    public void should_calculate_multiply_operation() {
        int result = calculator.eval("15*11");
        Assert.assertEquals(165, result);
    }

    @Test
    public void should_calculate_divide_operation() {
        int result = calculator.eval("8/3");
        Assert.assertEquals(2, result);
    }
}
