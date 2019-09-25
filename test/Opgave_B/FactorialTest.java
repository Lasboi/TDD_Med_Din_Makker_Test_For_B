package Opgave_B;

import junit.framework.TestCase;

public class FactorialTest extends TestCase {

    //Test case - Gange to tal sammen
    //Input: x = 2, y = 4
    //Forventet output: sum = 8
    public void testTimes() {
        int x = 2;
        int y = 4;
        int sum = 0;

        sum = Factorial.findFactorialTwoNumbers(x, y);

        assertEquals(8, sum);
    }

    //Test case - Tæl x, y og z 10 op
    //Input: x = 0, y = 2, z = 4
    //Forventet output: x = 10, y = 12, z = 14
    public void testTenNumbers() {
        int x = Factorial.countNumberUp(0);
        int y = Factorial.countNumberUp(2);
        int z = Factorial.countNumberUp(4);

        assertEquals(10, x);
        assertEquals(12, y);
        assertEquals(14, z);
    }

    //Test case - Udskriv resultat til konsol
    //Input: x = 2, y = 2, z = 4
    //Forventet output: "Resultatet af 2 * 2 * 4 er 16"
    public void testString() {
        int x = 2;
        int y = 2;
        int z = 4;
        String answer;

        answer = Factorial.outputText(2, 2, 4);
        assertEquals("Resultatet af 2 * 2 * 4 er 16", answer);
    }

    //Edge Test Case - Hvis et tal er nul sæt det til 1
    //Input: x = 0, y = 0, z = 4
    //Forventet output: x = 1, y = 1, z = 4
    public void testIfNumberZero() {
        int x = Factorial.ifXIsZero(0);
        int y = Factorial.ifXIsZero(0);
        int z = Factorial.ifXIsZero(4);


        assertEquals(1, x);
        assertEquals(1, y);
        assertEquals(4, z);
    }

    //Test Case - Få Factorial til at virke på x
    //Input: x = 3, x = 4
    //Forventet output: result = 6, result = 24
    public void testFactorial() {
        int x = 3;
        int result = Factorial.findFactorial(x);
        assertEquals(6, result);

        x = 4;
        result = Factorial.findFactorial(x);
        assertEquals(24, result);

    }
}