package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidAnagramTest {

    private ValidAnagram validAnagram;

    @Before
    public void setup() {
        validAnagram = new ValidAnagram();
    }

    @Test
    public void isValidAnagrams_true() {
        String firstText = "hello";
        String secondText = "elloh";
        assertTrue(validAnagram.IsValidAnagrams(firstText,secondText));
    }

    @Test
    public void isValidAnagrams_false() {
        String firstText = "hello";
        String secondText = "hi";
        assertFalse(validAnagram.IsValidAnagrams(firstText,secondText));
    }
}