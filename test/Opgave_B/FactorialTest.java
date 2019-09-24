package Opgave_B;

import junit.framework.TestCase;

public class FactorialTest extends TestCase {

    //Test case - Gange to tal sammen
    //Input: x = 2, y = 4
    //Forventet output: sum = 8
    public void testFactorial() {
        int x = 2;
        int y = 4;
        int sum = 0;

        sum = x * y;

        assertEquals(8, sum);


    }

    //Test case - Lav tæl x, y og z 10 op
    //Input: x = 0, y = 2, z = 4
    //Forventet output: x = 10, y = 12, z = 14
    public void testTenNumbers() {
        int x = 0;
        int y = 2;
        int z = 4;

        for (int i = 0; i < 10 ; i++) {
            x++;
            y++;
            z++;
        }

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
        int sum = 0;
        String answer = "";

        sum = x * y * z;

       answer = "Resultatet af " + x + " * " + y + " * " + z + " er " + sum;

       assertEquals("Resultatet af 2 * 2 * 4 er 16", answer);
    }

    //Edge Test Case - Vi vil ikke gange med 0!
    //Input: x = 0, y = 0, z = 4
    //Forventet output: x = 1, y = 1, z = 4
    public void testIfNumberZero() {
        int x = 0;
        int y = 0;
        int z = 4;

        if (x == 0 && y != 0 && z != 0) {
            x++;
        }
        else if (x != 0 && y == 0 && z != 0) {
            y++;
        }
        else if (x != 0 && y != 0 && z == 0) {
            z++;
        }
        else if (x == 0 && y == 0 && z != 0) {
            x++;
            y++;
        }
        else if (x == 0 && y != 0 && z == 0) {
            x++;
            z++;
        }
        else if (x != 0 && y == 0 && z == 0) {
            y++;
            z++;
        }

        assertEquals(1, x);
        assertEquals(1, y);
        assertEquals(4, z);
    }

}