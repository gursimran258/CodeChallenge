package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateNumberTest {

    private DuplicateNumber duplicateNumber;

    @Before
    public void setup() {
        duplicateNumber = new DuplicateNumber();
    }

    @Test
    public void findDuplicate() {
        int[] intArray = {1,1,2,3};
        int actualResult = duplicateNumber.findDuplicate(intArray);
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }
}