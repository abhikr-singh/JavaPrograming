package com.java.example.mettl.problems;

import java.util.Scanner;

/*
 * Given a string s, the task is to find the length of the longest proper prefix which is also a suffix. 
 * A proper prefix is a prefix that doesn’t include whole string. For example, prefixes of “abc” are “”, 
 * “a”, “ab” and “abc” but proper prefixes are “”, “a” and “ab” only.
 * 
 *     Input: s = “aabcdaabc”
 *     Output: 4
 *     Explanation: The string “aabc” is the longest proper prefix which is also the suffix.
 *
 *     Input: s= “ababab”
 *     Output: 4
 *     Explanation: The string “abab” is the longest proper prefix which is also the suffix.
 *
 *     Input: s = “aaaa”
 *     Output: 3
 *     Explanation: The string “aaa” is the longest proper prefix which is also the suffix.
 */
public class LongestPrefixSuffix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int result = longestPrefixSuffix(str);
        System.out.println("Length of the longest prefix which is also a suffix: " + result);
        scanner.close();
    }

    public static int longestPrefixSuffix(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int len = 0; // Length of the previous longest prefix suffix
        lps[0] = 0; // lps[0] is always 0

        int i = 1;
        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps[n - 1]; // Length of the longest prefix which is also a suffix
    }
}
