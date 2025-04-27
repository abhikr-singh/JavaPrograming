package com.java.example.prefixsum;

import java.util.Arrays;

public class PrefixSum {

    public static void main(String[] args) {

      int[] intArray =  {1, 2, 3, 4, 5, 6};
      System.out.println(Arrays.toString(prefixSum(intArray)));

    }

    public static int[] prefixSum(int[] input) {
        for (int i = 1; i < input.length; i++) {
            input[i] = input[i] + input[i - 1];
        }
        return input;
    }
}
