package com.java.example.mettl.problems;

/*
 * Problem: Bit by Bit
 *
 *    Alice is given an array A of size N.
 *
 *    She needs to divide A into one or more contiguous intervals.
 *
 *    For each interval:
 *
 *        Calculate the bitwise OR of all elements in that interval.
 *
 *    Then:
 *
 *        Calculate the bitwise XOR of all the interval OR results.
 * 
 * Find the minimum possible XOR value she can achieve by dividing the array properly.
 */
public class Problem2 {

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int result = minXorValue(A);
        System.out.println("Minimum XOR value: "+result);
    }

    static int minXorValue(int[] A) {

        int n = A.length;
        int minResult = Integer.MAX_VALUE;

        // There are (n-1) possible split points
        int totalMasks = 1 << (n - 1); // 2^(n-1) possible ways to split
        
        for (int mask = 0; mask < totalMasks; mask++) {
            int xor = 0;
            int or = 0;
            
            for (int i = 0; i < n; i++) {
                or |= A[i]; // OR current number
                // If there is a split after i-th index, or last element
                if ((mask & (1 << i)) != 0 || i == n - 1) {
                    xor ^= or; // XOR the OR value into result
                    or = 0;    // Reset OR for next interval
                }
            }
            
            minResult = Math.min(minResult, xor);
        }
        
        return minResult;

    }

}
