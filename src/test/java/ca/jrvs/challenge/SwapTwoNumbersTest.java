package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwapTwoNumbersTest {

    SwapTwoNumbers swapTwoNumbers;

    @Before
    public void setUp() {
        swapTwoNumbers = new SwapTwoNumbers();
    }

    @Test
    public void swapNumbers() {
        int testArray[] = {1,3};
        int actualArray[] = swapTwoNumbers.swapNumbers(testArray);
        int expectedArray[] = {3,1};
        assertArrayEquals(expectedArray,actualArray);
    }
}