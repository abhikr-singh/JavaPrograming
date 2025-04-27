package com.java.example.mettl.problems;

// Maximum difference between two elements such that larger element appears after the smaller number
public class MaxDifference {

    public static void main(String[] args) {
        int[] arr = {7, 9, 5, 6, 3, 2};
        System.out.println("Maximum difference is: " + maxDifference(arr));
    }

    public static int maxDifference(int[] arr) {
        int maxDiff = arr[1] - arr[0];
        int minElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - minElement > maxDiff) {
                maxDiff = arr[i] - minElement;
            }
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
        }
        return maxDiff;
    }

}
