package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedArraysTest {

    private MergeSortedArrays mergeSortedArrays;

    @Before
    public void setUp() {
        mergeSortedArrays = new MergeSortedArrays();
    }

    @Test
    public void mergeArrays() {
        int[] firstArray = {2,3,4};
        int[] secondArray = {1,4,9};
        int[] expectedAray = {1,2,3,4,4,9};
        int[] mergerdArray = mergeSortedArrays.mergeArrays(firstArray, secondArray);
        assertArrayEquals(expectedAray,mergerdArray);
    }
}