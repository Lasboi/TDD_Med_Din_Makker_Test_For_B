package Opgave_B;

public class Factorial {

    public static int findFactorial(int x) {

        int result = 1;

        for (int i = x; i > 0; i--) {
            result *= i;
        }

        return result;

    }

    public static int findFactorialTwoNumbers(int x, int y) {

        int result;

        result = x * y;

        return result;

    }

    public static String outputText( int x, int y, int z) {

        String result = "";

        int sum = x * y * z;
        result = "Resultatet af " + x + " * " + y + " * " + z + " er " + sum;

        return result;

    }

    public static int countNumberUp(int x) {

        int result;

        result = x + 10;

        return result;

    }
        public static int ifXIsZero(int x) {
            int resultat = x;
                while (x == 0) {
                    return x + 1;
                }
                return resultat;

    }
}