package com.java.example.mettl.problems;

/*
 * The image shows a coding question from a Mettl Online Assessment involving a recursive function, likely called the "Fellis Function." Here's a breakdown of what it describes:
 *
 *   The recursive function f(N) is defined as:
 *
 *    f(0) = 1
 *
 *    f(1) = 1
 *
 *    For N ≥ 2:
 *    f(N) = (f(N - 1) + 7 * f(N - 2) * (N / 2)) % (1e9 + 7)
 */
public class Problem6 {

    public static void main(String[] args) {
        int N = 3; // Change this value to test other inputs
        System.out.println("f(" + N + ") = " + fellis(N));
    }

    static final int MOD = 1_000_000_007;

    public static int fellis(int N) {
        if (N == 0 || N == 1) return 1;

        long result = (fellis(N - 1) + 7L * fellis(N - 2) * (N / 2)) % MOD;
        return (int) result;
    }
}
