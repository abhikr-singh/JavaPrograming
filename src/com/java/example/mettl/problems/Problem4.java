package com.java.example.mettl.problems;

/*
 * Problem Summary: Bruce has an integer array A of size N. He must:
 *
 *    Square each element of the array.
 *
 *    Find the binary equivalent of each squared element.
 *
 *    Count the number of set bits (1s) in the binary representation for each element.
 *
 *    Find two elements:
 *
 *        X: The number with the maximum number of set bits (if a tie, pick the smaller number).
 *
 *        Y: The number with the minimum number of set bits (if a tie, pick the smaller number).
 *
 *    Multiply X and Y.
 *
 *   Return the smallest power of 2 that is greater than or equal to the product.
 *
 * Note:
 *
 *    Set bits = number of 1s in binary.
 *
 *    If multiple elements have the same number of set bits, choose the smaller number.
 */
public class Problem4 {

    public static void main(String[] args) {
        int[] A = {2, 3, 5};
        int result = solve(A);
        System.out.println(result);
    }

    public static int solve(int[] A) {
        int n = A.length;
        int[] updatedArray = new int[n];

        // Step 1: Square each element
        for (int i = 0; i < n; i++) {
            updatedArray[i] = A[i] * A[i];
        }

        // Step 2 & 3: Find number of set bits
        int maxSetBits = -1, minSetBits = Integer.MAX_VALUE;
        int maxElement = Integer.MAX_VALUE, minElement = Integer.MAX_VALUE;

        for (int val : updatedArray) {
            int setBits = countSetBits(val);

            // Find max set bits element
            if (setBits > maxSetBits || (setBits == maxSetBits && val < maxElement)) {
                maxSetBits = setBits;
                maxElement = val;
            }

            // Find min set bits element
            if (setBits < minSetBits || (setBits == minSetBits && val < minElement)) {
                minSetBits = setBits;
                minElement = val;
            }
        }

        // Step 5: Multiply max and min elements
        int product = maxElement * minElement;

        // Step 6: Find the nearest power of 2
        return nextPowerOfTwo(product);
    }

    // Method to count set bits
    public static int countSetBits(int num) {
        return Integer.bitCount(num);
    }

    // Method to find the next power of 2
    public static int nextPowerOfTwo(int num) {
        if (num <= 0) return 1;
        int power = 1;
        while (power < num) {
            power <<= 1; // Left shift to multiply by 2
        }
        return power;
    }
}
