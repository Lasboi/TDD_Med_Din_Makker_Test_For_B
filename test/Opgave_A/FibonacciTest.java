package Opgave_A;

import junit.framework.TestCase;

public class FibonacciTest extends TestCase {

    public void testFibonacci() {

        // Test: læg alle værdier sammen fra 0 til X
        int result;

        /*
        Test 1:
        input:                      5
        output:                     15
         */
        result = Fibonacci.getFibonacci(5);
        assertEquals(15, result);

        /*
        Test 1:
        input:                      -5
        output:                     -15
         */
        result = Fibonacci.getFibonacci(-5);
        assertEquals(-15, result);

        /*
        Test 1:
        input:                      0
        output:                     0
         */
        result = Fibonacci.getFibonacci(0);
        assertEquals(0, result);

    }

}
