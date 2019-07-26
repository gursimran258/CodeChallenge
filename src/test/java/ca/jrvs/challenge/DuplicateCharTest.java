package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateCharTest {

    DuplicateChar duplicateChar;

    @Before
    public void setUp() {
        duplicateChar = new DuplicateChar();
    }

    @Test
    public void duplicate() {
        char[] duplicateArray = duplicateChar.duplicate("hello");
        char[] expectedArray={'l'};
       // assertArrayEquals(expectedArray,duplicateArray);
    }
}