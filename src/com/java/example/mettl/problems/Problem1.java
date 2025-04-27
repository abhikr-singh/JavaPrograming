package com.java.example.mettl.problems;

/*
 * Problem:
 *
 *    Bob has a string S.
 *
 *    Each day, he appends S again to form K.
 *
 *    Alice has a string T.
 *
 *    Find and return the first day when K contains T as a subsequence.
 *
 *    Subsequence means you can skip characters but must maintain order.
 * 
 * 
 */
public class Problem1 {

    public static void main(String[] args) {
        String s = "ab";
        String k = "aab";

        boolean subsequenceFound = false;
        String text = "";
        int day = 0;

        while (!subsequenceFound) {

            text += s;
            day += 1;
            if (text.length() > k.length()) {
                if(subsequenceFound(text, k)) {
                    subsequenceFound = true;
                    break;
                }
            }
        }
        System.out.println(day);
    }

    static boolean subsequenceFound(String text, String pattern) {
        int i = 0;
        int j = 0;
        int matchedCount = 0;
        while(i < text.length()) {
            
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
                matchedCount++;
            } else {
                i++;
            }
            if (matchedCount == pattern.length()) {
                return true;
            }

        }

        return false;
    }
}
