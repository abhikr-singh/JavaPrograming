package com.java.example.mettl.problems;

/*
 * Problem Summary:
 *
 *    You are given a positive integer N.
 *
 *    Rearrange the bits of N so that all the 1s (set bits) are together in the binary representation, and form the minimum possible integer.
 *
 *    Task: Return that minimum integer after rearrangement.
 *
 * Example:
 *
 *    Input: 10
 *
 *    Binary of 10: 1010
 *
 *    After rearrangement: group the 1s together as 0011 => decimal 3.
 */
public class Problem5 {

    public static void main(String[] args) {
        int input = 10;
        System.out.println(rearrangeBits(input));

    }

    public static int rearrangeBits(int input1) {
        // Count the number of set bits
        int count = Integer.bitCount(input1);
        
        // Form the minimum number with 'count' number of set bits
        int result = (1 << count) - 1;
        
        return result;
    }

}
