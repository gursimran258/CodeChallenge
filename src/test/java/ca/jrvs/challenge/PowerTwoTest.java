package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTwoTest {

    private PowerTwo powerTwo;

    @Before
    public void setup() {
        powerTwo = new PowerTwo();
    }

    @Test
    public void isPowerOfTwo_true() {
        assertTrue(powerTwo.isPowerOfTwo(64));
    }

    @Test
    public void isPowerOfTwo_false() {
        assertFalse(powerTwo.isPowerOfTwo(9));
    }
}