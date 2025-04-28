package com.java.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWords {

    public static void main(String[] args) {
        String sentence = "Hi, I am Hritik and I am a programmer.";
        String[] words = sentence.split(" ");

        Map<String, Integer> wordMap = new HashMap<>();

        for (String word : words) {

            if (wordMap.get(word) != null) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        Set<Entry<String,Integer>> entrySet = wordMap.entrySet();

        for (Entry<String,Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

    }

}
