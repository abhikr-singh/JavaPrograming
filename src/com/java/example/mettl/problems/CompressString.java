package com.java.example.mettl.problems;

import java.util.Scanner;

/*
 * The function compressString takes a string as input and compresses it by replacing consecutive duplicate characters with the character followed by the count of duplicates.
 * For example, the string "aaabbc" would be compressed to "a3b2c1".
 * The function uses a StringBuilder to build the compressed string and iterates through the input string, counting consecutive duplicates.
 * If the compressed string is longer than the original string, the function returns the original string.
 * The time complexity of this function is O(n), where n is the length of the input string, as it iterates through the string once.
 * The space complexity is O(n) in the worst case, where the compressed string is longer than the original string.
 * In that case, the function would return the original string, which requires O(n) space to store.
 * If the compressed string is shorter, it would require O(m) space, where m is the length of the compressed string.
 * In the best case, where the input string has no consecutive duplicates, the space complexity would be O(n) for the compressed string.
 */
public class CompressString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to compress: ");
        String input = scanner.nextLine();
        scanner.close();
        // Compress the string
        String compressed = compressString(input);
        System.out.println("Compressed string: " + compressed);
    }

    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressed.append(str.charAt(str.length() - 1)).append(count);

        return compressed.length() < str.length() ? compressed.toString() : str;
    }

}
