package com.highestPrime;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests that the isPrime() method returns expected boolean output
 */
public class HighestPrimeTest {
    @Test
    public void testPrimeNumber() {
        assertTrue(HighestPrime.isPrime(25765189));
    }

}