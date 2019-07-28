package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberTest {

    private MissingNumber missingNumber;

    @Before
    public void setUp() {
     missingNumber = new MissingNumber();
    }

    @Test
    public void findMissingNumber() {
        int[] initArray = {0,1,2,3};
        int actualMissingNum = missingNumber.findMissingNumber(initArray);
        int expectedMissingNum = 4;
        assertEquals(expectedMissingNum,actualMissingNum);
    }
}