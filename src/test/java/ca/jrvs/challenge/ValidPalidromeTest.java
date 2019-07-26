package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPalidromeTest {

    private ValidPalidrome validPalidrome;

    @Before
    public void setUp() {
        validPalidrome = new ValidPalidrome();
    }

    @Test
    public void isPalindrome_true() {
        boolean test = validPalidrome.isPalindrome("madam");
        assertTrue(test);
    }

    @Test
    public void isPalindrome_false() {
        boolean test = validPalidrome.isPalindrome("hello");
        assertFalse(test);
    }
}