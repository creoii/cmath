package io.creoii.cmath;

import net.jafama.FastMath;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static List<Long> CMATH = new ArrayList<>();
    public static List<Long> MATH = new ArrayList<>();
    public static List<Long> JAFAMA = new ArrayList<>();
    public static List<Long> APACHE = new ArrayList<>();
    public static List<Long> HIPPARCHUS = new ArrayList<>();

    public static void main(String[] args) {
        //for (int i = 0; i < 100; ++i) {
        //    testPow();
        //}
//
        //long t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0;
//
        //for (long l : CMATH) {
        //    t1 += l;
        //}
        //for (long l : MATH) {
        //    t2 += l;
        //}
        //for (long l : JAFAMA) {
        //    t3 += l;
        //}
        //for (long l : APACHE) {
        //    t4 += l;
        //}
        //for (long l : HIPPARCHUS) {
        //    t5 += l;
        //}
//
        //System.out.println("CMath Avg: ".concat(String.valueOf(t1 / 1000)));
        //System.out.println("Math Avg: ".concat(String.valueOf(t2 / 1000)));
        //System.out.println("Jafama Avg: ".concat(String.valueOf(t3 / 1000)));
        //System.out.println("Apache Avg: ".concat(String.valueOf(t4 / 1000)));
        //System.out.println("Hipparchus Avg: ".concat(String.valueOf(t5 / 1000)));
        ;
        long startTime1 = ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime();
        for (int i = 0; i < 100000; ++i) {
            int j1 = 2;
            int k1 = -1;
            System.out.println(CMath.pow(j1, k1));
            //System.out.println(FastMath.pow(j1, k1));
            //System.out.println(org.apache.commons.math3.util.FastMath.pow(j1, k1));
            //System.out.println(org.hipparchus.util.FastMath.pow(j1, k1));
            //System.out.println(Math.pow(j1, k1));
        }
        long endTime1 = ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime() - startTime1;
        System.out.println("Took ".concat(String.valueOf(endTime1 / 1000000)).concat("ms"));
    }

    public static void testPow() {
        long startTime1 = System.currentTimeMillis();
        int j1 = 5;
        int k1 = 5; // 3125
        System.out.println(String.valueOf(j1).concat("^").concat(String.valueOf(k1)).concat(" = ").concat(String.valueOf(CMath.pow(j1, k1))));
        long endTime1 = System.currentTimeMillis() - startTime1;
        System.out.println("CMath:  ".concat(String.valueOf(endTime1)).concat("ns"));
        CMATH.add(endTime1);
        System.out.println();

        long startTime2 = System.currentTimeMillis();
        int j2 = 5;
        int k2 = 5;
        System.out.println(String.valueOf(j2).concat("^").concat(String.valueOf(k2)).concat(" = ").concat(String.valueOf(FastMath.pow(j2, k2))));
        long endTime2 = System.currentTimeMillis() - startTime2;
        System.out.println("Jafama: ".concat(String.valueOf(endTime2)).concat("ns"));
        JAFAMA.add(endTime2);
        System.out.println();

        long startTime3 = System.currentTimeMillis();
        int j3 = 5;
        int k3 = 5;
        System.out.println(String.valueOf(j3).concat("^").concat(String.valueOf(k3)).concat(" = ").concat(String.valueOf(org.apache.commons.math3.util.FastMath.pow(j3, k3))));
        long endTime3 = System.currentTimeMillis() - startTime3;
        System.out.println("Apache: ".concat(String.valueOf(endTime3)).concat("ns"));
        APACHE.add(endTime3);
        System.out.println();

        long startTime4 = System.currentTimeMillis();
        int j4 = 5;
        int k4 = 5;
        System.out.println(String.valueOf(j4).concat("^").concat(String.valueOf(k4)).concat(" = ").concat(String.valueOf(org.hipparchus.util.FastMath.pow(j4, k4))));
        long endTime4 = System.currentTimeMillis() - startTime4;
        System.out.println("Hipparchus: ".concat(String.valueOf(endTime4)).concat("ns"));
        HIPPARCHUS.add(endTime4);
        System.out.println();

        long startTime5 = System.currentTimeMillis();
        int j5 = 5;
        int k5 = 5;
        System.out.println(String.valueOf(j5).concat("^").concat(String.valueOf(k5)).concat(" = ").concat(String.valueOf(Math.pow(j5, k5))));
        long endTime5 = System.currentTimeMillis() - startTime5;
        System.out.println("Math: ".concat(String.valueOf(endTime5)).concat("ns"));
        MATH.add(endTime5);
        System.out.println();
    }

    public static void testMult() {
        long startTime1 = System.nanoTime();
        int j1 = 25;
        int k1 = 25; // 625
        System.out.println(String.valueOf(j1).concat("*").concat(String.valueOf(k1)).concat(" = ").concat(String.valueOf(CMath.mult(j1, k1))));
        long endTime1 = System.nanoTime() - startTime1;
        System.out.println("CMath:  ".concat(String.valueOf(endTime1)).concat("ns"));
        CMATH.add(endTime1);
        System.out.println();

        long startTime2 = System.nanoTime();
        int j2 = 25;
        int k2 = 25;
        System.out.println(String.valueOf(j2).concat("*").concat(String.valueOf(k2)).concat(" = ").concat(String.valueOf(FastMath.multiplyExact(j2, k2))));
        long endTime2 = System.nanoTime() - startTime2;
        System.out.println("Jafama: ".concat(String.valueOf(endTime2)).concat("ns"));
        JAFAMA.add(endTime2);
        System.out.println();

        long startTime3 = System.nanoTime();
        int j3 = 25;
        int k3 = 25;
        System.out.println(String.valueOf(j3).concat("*").concat(String.valueOf(k3)).concat(" = ").concat(String.valueOf(org.apache.commons.math3.util.FastMath.multiplyExact(j3, k3))));
        long endTime3 = System.nanoTime() - startTime3;
        System.out.println("Apache: ".concat(String.valueOf(endTime3)).concat("ns"));
        APACHE.add(endTime3);
        System.out.println();

        long startTime4 = System.nanoTime();
        int j4 = 25;
        int k4 = 25;
        System.out.println(String.valueOf(j4).concat("*").concat(String.valueOf(k4)).concat(" = ").concat(String.valueOf(org.hipparchus.util.FastMath.multiplyExact(j4, k4))));
        long endTime4 = System.nanoTime() - startTime4;
        System.out.println("Hipparchus: ".concat(String.valueOf(endTime4)).concat("ns"));
        HIPPARCHUS.add(endTime4);
        System.out.println();

        long startTime5 = System.nanoTime();
        int j5 = 25;
        int k5 = 25;
        System.out.println(String.valueOf(j5).concat("^").concat(String.valueOf(k5)).concat(" = ").concat(String.valueOf(Math.multiplyExact(j5, k5))));
        long endTime5 = System.nanoTime() - startTime5;
        System.out.println("Math: ".concat(String.valueOf(endTime5)).concat("ns"));
        MATH.add(endTime5);
        System.out.println();
    }

    public static void testRound() {
        long startTime1 = System.nanoTime();
        double j1 = 4.55;
        System.out.println(String.valueOf(j1).concat(" -> ").concat(String.valueOf(CMath.round(j1))));
        long endTime1 = System.nanoTime() - startTime1;
        System.out.println("CMath:  ".concat(String.valueOf(endTime1)).concat("ns"));
        CMATH.add(endTime1);
        System.out.println();

        long startTime2 = System.nanoTime();
        double j2 = 4.55;
        System.out.println(String.valueOf(j2).concat(" -> ").concat(String.valueOf(FastMath.round(j2))));
        long endTime2 = System.nanoTime() - startTime2;
        System.out.println("Jafama: ".concat(String.valueOf(endTime2)).concat("ns"));
        JAFAMA.add(endTime2);
        System.out.println();

        long startTime3 = System.nanoTime();
        double j3 = 4.55;
        System.out.println(String.valueOf(j3).concat(" -> ").concat(String.valueOf(org.apache.commons.math3.util.FastMath.round(j3))));
        long endTime3 = System.nanoTime() - startTime3;
        System.out.println("Apache: ".concat(String.valueOf(endTime3)).concat("ns"));
        APACHE.add(endTime3);
        System.out.println();

        long startTime4 = System.nanoTime();
        double j4 = 4.55;
        System.out.println(String.valueOf(j4).concat(" -> ").concat(String.valueOf(org.hipparchus.util.FastMath.round(j4))));
        long endTime4 = System.nanoTime() - startTime4;
        System.out.println("Hipparchus: ".concat(String.valueOf(endTime4)).concat("ns"));
        HIPPARCHUS.add(endTime4);
        System.out.println();

        long startTime5 = System.nanoTime();
        double j5 = 4.55;
        System.out.println(String.valueOf(j5).concat(" -> ").concat(String.valueOf(Math.round(j5))));
        long endTime5 = System.nanoTime() - startTime5;
        System.out.println("Math: ".concat(String.valueOf(endTime5)).concat("ns"));
        MATH.add(endTime5);
        System.out.println();
    }
}
