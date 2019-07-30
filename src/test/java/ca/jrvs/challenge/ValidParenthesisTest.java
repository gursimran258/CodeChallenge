package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesisTest {
    private ValidParenthesis validParenthesis;

    @Before
    public void setUp() {
        validParenthesis = new ValidParenthesis();
    }

    @Test
    public void isValidParenthesisHappy() {
        String inputString = "[({})]";
        assertTrue(validParenthesis.isValidParenthesis(inputString));
    }

    @Test
    public void isValidParenthesisSad() {
        String inputString = "[({]";
        assertFalse(validParenthesis.isValidParenthesis(inputString));
    }
}