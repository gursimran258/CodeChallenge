package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegersinUnsortedArrayTest {

    private IntegersinUnsortedArray integersinUnsortedArray;

    @Before
    public void setUp() {
        integersinUnsortedArray = new IntegersinUnsortedArray();
    }

    @Test
    public void largestSmallestIntinArray() {
        int[] inputArray = {2, 1, 5, 4};
        int[] expectedArray = {1, 5};
        int[] actualArray = integersinUnsortedArray.largestSmallestIntinArray(inputArray);
        assertArrayEquals(expectedArray, actualArray);


    }

}