package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciNumberTest {

    private FibonacciNumber fibonacciNumber;

    @Before
    public void setUp() {
       fibonacciNumber = new FibonacciNumber();
    }

    @Test
    public void getFibonacci() {
        int actualResult = fibonacciNumber.getFibonacci(5);
        int expectedResult = 7;
        assertEquals(expectedResult,actualResult);
    }
}