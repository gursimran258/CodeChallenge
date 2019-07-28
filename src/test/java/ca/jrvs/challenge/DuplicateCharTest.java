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
        Character[] duplicateArray = duplicateChar.duplicate("hi there hello");
        Character[] expectedArray={'e','h','l'};
        assertArrayEquals(expectedArray,duplicateArray);
    }
}