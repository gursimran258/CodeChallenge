package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateInArrayTest {

    DuplicateInArray duplicateInArray;

    @Before
    public void setUp() {
        duplicateInArray = new DuplicateInArray();
    }

    @Test
    public void containsDuplicae() {
        int[] numsList = {5,1,3,1,8};
        assertTrue(duplicateInArray.containsDuplicae(numsList));
     }
}