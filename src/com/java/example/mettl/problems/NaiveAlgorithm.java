package com.java.example.mettl.problems;

import java.util.Scanner;

/*
 * Given text string with length n and a pattern with length m, the task is to prints all occurrences of pattern in text.
 * Note: You may assume that n > m.
 * 
 * Input:  text = "THIS IS A TEST TEXT", pattern = "TEST"
 * Output: Pattern found at index 10
 *
 *
 *Input:  text =  "AABAACAADAABAABA", pattern = "AABA"
 *Output: Pattern found at index 0, Pattern found at index 9, Pattern found at index 12
 *
 */
public class NaiveAlgorithm {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String text = "THIS IS A TEST TEXT";
            String pattern = "TEST";
            naiveAlgorithm(text, pattern);

        }
    }

    static void naiveAlgorithm(String text, String pattern) {
        for(int i = 0; i <= text.length() - pattern.length(); i++) {
            int index = 0;
            boolean patternNotFound = false;

            for (int j = 0; j < pattern.length(); j++) {
                if (pattern.charAt(j) != text.charAt(i + j)) {
                    patternNotFound = true;
                    break;
                }
            }
            index = i;

            if (!patternNotFound) {
                System.out.println("Pattern found at index: "+index);
            }
        }

    }

}
