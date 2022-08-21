package task4;

public class RecursiveMultiplication {

    static int multiplication(int n, int m)
    {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (m == 1) {
            return n;
        }

        if (n == 1) {
            return m;
        }

        return n + multiplication(n, m - 1);
    }

    public static int productOfNumbers(int n, int m)
    {
        int product = multiplication(n, Math.abs(m));
        return (m < 0) ? -product : product;
    }

}