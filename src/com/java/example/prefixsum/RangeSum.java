package com.java.example.prefixsum;

public class RangeSum {

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 3, 4, 5, 6};
        int i = 1;
        int j = 4;

        int[] prefixSum = PrefixSum.prefixSum(inputArray);
        int sumOfRange = prefixSum[j] - prefixSum[i - 1];

        System.out.println("Sum between the range " + i + " and " + j + " is " + sumOfRange);

    }

}
