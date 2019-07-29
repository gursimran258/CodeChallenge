package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsTest {
    private ReverseWords reverseWords;

    @Before
    public void setUp() {
        reverseWords = new ReverseWords();
    }

    @Test
    public void reverseWords() {
        String sentence = "Hello I am there";
        String expectedRevSent = "there am I Hello";
        String actualRevSent = reverseWords.reverseWords(sentence);
        assertEquals(expectedRevSent,actualRevSent);
    }
}