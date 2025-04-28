package com.java.example;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

    public static void main(String[] args) {

        char[] input = "HappyNewYear".toCharArray();
        String result = removeDuplicates(input);
        System.out.println(result);
    }

    static String removeDuplicates(char[] input) {

        Map<Character, Integer> exists = new HashMap<>();
        String result = "";
        for (int i = 0; i < input.length; i++) {
            if (!exists.containsKey(input[i])) {
                result += input[i];
                exists.put(input[i], 1);
            }
        }

        return result;
    }
}
