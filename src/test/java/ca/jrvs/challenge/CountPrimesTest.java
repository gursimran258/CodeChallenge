package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountPrimesTest {

    CountPrimes countPrimes;

    @Before
    public void setUp() {
        countPrimes = new CountPrimes();
    }

    @Test
    public void primesList() {
        //  int[] actualList = new int[5];
        int[] actualList = countPrimes.primesList(5);
        int[] expectedResult = {2, 3};
        assertArrayEquals(expectedResult, actualList);
    }
}