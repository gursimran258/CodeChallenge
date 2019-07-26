package ca.jrvs.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {

    private EvenOdd evenOdd;

    @Before
    public void setup() {
        evenOdd = new EvenOdd();
    }

    @Test
    public void evenOddModulo_even() {
        boolean test = evenOdd.evenOddModulo(14);
        assertTrue(test);
    }

    @Test
    public void evenOddModulo_odd() {
        boolean test = evenOdd.evenOddModulo(13);
        assertFalse(test);
    }

    @Test
    public void evenOddBit_even() {
        boolean test = evenOdd.evenOddBit(16);
        assertTrue(test);
    }

    @Test
    public void evenOddBit_odd() {
        boolean test = evenOdd.evenOddBit(15);
        assertFalse(test);
    }
}