package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateRemovalArrayTest {

    private DuplicateRemovalArray duplicateRemovalArray;

    @Before
    public void setUp(){
        duplicateRemovalArray = new DuplicateRemovalArray();
    }

    @Test
    public void removeDuplicatesinArray() {
        int[] inputArray = {1,1,2,3,3,4};
        int[] actualOutput = duplicateRemovalArray.removeDuplicatesinArray(inputArray);
    }
}