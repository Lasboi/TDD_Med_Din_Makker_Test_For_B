package Opgave_A;

public class Fibonacci {
    public static int getFibonacci(int x) {
        int resultat = 0;

        for (int i = 0; i < 3; i++) {
            resultat = resultat + x;
        }
        x = resultat;
        return x;

    }
}
