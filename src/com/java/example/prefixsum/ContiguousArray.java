package com.java.example.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    public static void main(String[] args) {
        // Given a binary num, return the max length of continuous subarray with an equal number of 0 and 1
        int[] nums = {0, 1, 0, 1, 0, 1, 1, 0};
        int result = findMaxLength(nums);
        System.out.println("Max length of contiguous subarray with equal number of 0 and 1: " + result);
    }

    public static int findMaxLength(int[] nums) {
        // Create a map to store the first occurrence of each prefix sum
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Initialize with prefix sum 0 at index -1

        int maxLength = 0;
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            // Convert 0s to -1s to use prefix sum technique
            prefixSum += (nums[i] == 0) ? -1 : 1;

            // Check if this prefix sum has been seen before
            if (map.containsKey(prefixSum)) {
                // Calculate the length of the subarray
                int length = i - map.get(prefixSum);
                maxLength = Math.max(maxLength, length);
            } else {
                // Store the first occurrence of this prefix sum
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }

}
