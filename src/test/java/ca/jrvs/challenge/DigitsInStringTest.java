package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DigitsInStringTest {

    DigitsInString digitsInString;

    @Before
    public void setUp() {
        digitsInString = new DigitsInString();
    }

    @Test
    public void checkDigits_digits() {
        assertTrue(digitsInString.checkDigits("123"));
    }

    @Test
    public void checkDigits_char() {
        assertFalse(digitsInString.checkDigits("hi"));
    }
}