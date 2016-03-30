package com.highestPrime;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by mkirby on 3/29/16.
 */
public class HighestPrimeTest {
    @Test
    public void testPrimeNumber() {
        assertTrue(HighestPrime.isPrime(7));
    }

}