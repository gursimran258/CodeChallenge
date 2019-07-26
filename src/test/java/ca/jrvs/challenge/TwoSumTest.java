package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    private TwoSum twoSum;

    @Before
    public void setUp(){
        twoSum = new TwoSum();
    }

    @Test
    public void checkTwoSum() {
        int[] initArray = {4,5,9,11,1};
        int[] twoArray = twoSum.checkTwoSum(initArray,9);
        int[] expectedArray = {0,1};
        assertArrayEquals(expectedArray,twoArray);
    }

    @Test
    public void twoSumMap(){
        int[] initArray = {4,7,9,11,1};
        int[] twoArray = twoSum.twoSumMap(initArray, 11);
        int[] expectedArray = {0,1};
        assertArrayEquals(expectedArray,twoArray);
    }
}