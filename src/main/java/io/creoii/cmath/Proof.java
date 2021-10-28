package io.creoii.cmath;

public class Proof {
    /**
     * 2^14 / 2 = 2^13
     * 2^16 / 2 = 2^15
     * 2^18 / 2 = 2^17
     * 2^20 / 2 = 2^19
     *
     * 3^14 / 3 = 3^13
     * 3^16 / 3 = 3^15
     * 3^18 / 3 = 3^17
     * 3^20 / 3 = 3^19
     *
     * 4^14 / 4 = 4^13
     * 4^16 / 4 = 4^15
     * 4^18 / 4 = 4^17
     * 4^20 / 4 = 4^19
     *
     * 3^4 = 81
     * 3^2 = 9
     * 9 * 9 = 81
     * so, (3^2) * (3^2) = 81
     *
     * Alternatively,
     * 3^8 = 6561
     * 3^4 = 81
     * 81 * 81 = 6561
     * so, (3^4) * (3^4) = 6561
     *
     * as the final expression, you multiply the total (3^4) by b/(b/2) or 8/4 or 2
     * ^^^ there is a more efficient way to do it ^^^
     * must figure it out
     *
     * USE THIS METHOD TO GET LEADING AND TAILING NUMBERS
     * (162141 % 1000000) / 100000  = 1
     * (162141 % 100000)  / 10000   = 6
     * (162141 % 10000    / 1000    = 2
     * (162141 % 1000)    / 100     = 1
     * (162141 % 100)     / 10      = 4
     * (162141 % 10)      / 1       = 1
     *
     * 2^14 = 16384     = 1 _+ (2^?  + ())  -  leading 1, tailing 4 = _638_
     * 6 | 38      = (2^5) + 6
     * 63 | 8      = (2^3)
     *
     * 2^16 = 65536     = 6 _+ (2^?  + ())  -  leading 6, tailing 4 = _553_
     * 5 | 53      = (2^5) + 21 or (2^6) + (2^3) - 3
     * 55 | 3      = 3
     *
     * 2^18 = 262144    = 2 _+ (2^? + ())  -  leading 2, tailing 4 = _6214_
     * 6 | 214     = (2^7) + (2^6) + (2^4) + 6
     * 62 | 14     = (2^3) + 6 or (2^4) - 2
     * 621 | 4     = (2^2)
     *
     * 2^20 = 1048576   = 1 _+ (2^? + ())  -  leading 1, tailing 4 = _04857_
     * 0 | 4857    = (2^12) + (2^9) + (2^8) - 7
     * 04 | 857    = (2^9) + (2^8) + (96) - 7
     * 048 | 57    = (2^6) - 7
     * 0485 | 7    = (2^3) - 1 or 7
     *
     * 2^22 = 4194304   = 4 _+ (2^? + ())  -  leading 4, tailing 4 = _19430_
     * 1 | 9430    = (2^13) + (2^10) + (2^8) - 42 or (2^13) + (2^10) + (2^7) + (86)
     * 19 | 430    =
     * 194 | 30    =
     * 1943 | 0    =
     *
     * 2^24 = 16777216  = 1 _+ (2^? + ())  -  leading 1, tailing 6 = _677721_
     * 6 | 77721   =
     * 67 | 7721   =
     * 677 | 721   =
     * 6777 | 21   =
     * 67772 | 1   =
     *
     *
     * 0 (0)
     * 2 (1)
     *
     * 4
     * 16
     * 64
     * 256
     * 1024 (10)
     * 4096
     * 16384
     * 65536
     * 262144
     * 1048576 (20)
     * 4194304
     * 16777216
     * 67108864
     * 268435456
     * 1073741824 (30)
     *
     * Half Method - this is used to cut the time in half. But we can do more.
     * X^30=(X^15)>>1
     * X^31=X*(X^15)>>1
     *
     *
     * PATTERNS:
     * For the first number in each power of 2 after 8 = 1,3,6,1,2,5,1,2,4,8
     * Or for only evens = 1,6,2,1,4
     *
     * For the last number in each power of 2 after 8 = 2,4,8,6
     * Or for only evens = 4,6
     *
     * The last two numbers of a power of 2 can Always be split into smaller powers of 2
     * Any number can ^^
     *
     *
     *
     * Info:
     * # of digits in the result (expensive)
     * Leading and Tailing Pattern (use mod % or bit operators to check?)
     * Cut in Half Method - build on top of this8
     */
    public static int fast_pow(int a, int b) {
        int digits = 1 + (int) (b * Math.log10(a));
        System.out.println(digits);

        if (a == 0) return 0;
        else if (a == 1 || b == 1) return a;
        else if (b != 0) {
            return 0;
        }
        else return 1;
    }
}
