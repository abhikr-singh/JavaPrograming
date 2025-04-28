package com.java.example.mettl.problems;


/*
 * Problem:
 *
 *    You are given two integers: N and A.
 *
 *    The equation you need to solve is:
 *
 *    N = (A * M) + D
 *
 *    where:
 *
 *    M is an integer you have to find.
 *
 *    D must be a positive divisor of M.
 *
 *    You must find all possible values of M that satisfy this condition.
 *
 *    Your task:
 *
 *    Find all possible valid values of M.
 *
 *    Return the sum of all such M.
 */
public class Problem3 {

    public static void main(String[] args) {
        int N = 10; // Example input
        int A = 2;

        int result = findSumOfPossibleM(N, A);
        System.out.println("Sum of all possible M values = " + result);
    }

    public static int findSumOfPossibleM(int N, int A) {
        int sum = 0;

        // M must be less than N, otherwise (A*M) > N
        for (int M = 1; A * M < N; M++) {
            int D = N - (A * M);

            // D must be positive and should divide M
            if (D > 0 && M % D == 0) {
                sum += M;
            }
        }

        return sum;
    }

}
