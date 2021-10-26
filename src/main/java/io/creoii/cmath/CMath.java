package io.creoii.cmath;

public class CMath {
    public static final double PI = 3.141592653;
    public static final double E = 2.718281828;
    public static final double DEG_2_RAD = 0.0174532925;
    public static final double RAD_2_DEG = 57.2957795;

    /**
     * @param a - A number
     * @param b - An exponent
     * @return a^b
     */
    public static int pow(int a, int b) {
        if (a == 0) return 0;
        else if (a == 1 || b == 1) return a;
        else if (b != 0) {
            int b2 = b >> 1, total = 1;
            for (int i = 0; i < b2; ++i) {
                total *= a;
            }
            total *= total;

            return b % 2 == 0 ? total : total * a;
        } else return 1;
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
}
