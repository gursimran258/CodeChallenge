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
    public void isValidParenthesis() {
        String inputString = "[(})]";
        boolean condition = validParenthesis.isValidParenthesis(inputString);
        System.out.println(condition);
    }
}