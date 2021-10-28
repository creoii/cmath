package io.creoii.cmath;

public class CMath {
    public static final double PI = 3.141592653;
    public static final double E = 2.718281828;
    public static final double DEG_2_RAD = 0.0174532925;
    public static final double RAD_2_DEG = 57.2957795;

    /**
     * @bigO - O((n / 2) - 1)
     *
     * @param b - A number
     * @param e - An exponent
     * @return b^e
     */
    public static double pow(int b, int e) {
        if (b == 0) return 0;
        else if (b == 1 || e == 1) return b;
        else if (e > 0) {
            byte b2 = (byte) (e >> 1);
            int total = b;
            for (byte i = 1; i < b2; ++i) total *= b;
            total *= total;
            return (e & 1) == 1 ? total * b : total;
        } else {
            byte b2 = (byte) ((-e >> 1) + 1);
            int total = b;
            for (byte i = 1; i < b2; ++i) total *= b;
            total *= total;
            return 2d / ((e & 1) == 1 ? total * b : total);
        }
    }

    /**
     * @param a - A number
     * @param b - A number
     * @return a*b
     */
    public static int mult(int a, int b) {
        int total = 0;

        for (int i = 0; b > 0; ++i) {
            if (b % 2 == 1) total += a << i;
            b /= 2;
        }

        return total;
    }

    /**
     * @param a - A double
     * @return The number rounded to the nearest integer
     */
    public static int round(double a) {
        return ((int) (a < 0 ? a - .5d : a + .5d));
    }
}
