package com.java.example.mettl.problems;

/*
 * Write a program to find the leader of elements in an array.
 * An element is a leader if it is greater than all the elements to its right side.
 * The rightmost element is always a leader.
 * For example, in the array {16, 17, 4, 3, 5, 2}, the leaders are 17, 5 and 2.
 * The function should return an array of leaders in the order they appear in the input array.
 * The time complexity of this function is O(n), where n is the length of the input array, as it iterates through the array once.
 * The space complexity is O(k), where k is the number of leaders found, as it stores the leaders in a separate array.
 * In the worst case, if all elements are leaders, the space complexity would be O(n).
 * In the best case, if no elements are leaders, the space complexity would be O(1).
 * The function uses a stack to store the leaders, which requires O(k) space.
 */
public class LeaderOfElements {

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int[] leaders = findLeaders(arr);
        System.out.print("Leaders in the array: ");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }

    public static int[] findLeaders(int[] arr) {
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        int count = 1; // Count of leaders
        int[] temp = new int[n]; // Temporary array to store leaders
        temp[0] = maxFromRight;

        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                temp[count++] = maxFromRight;
            }
        }

        // Create the final array of leaders
        int[] leaders = new int[count];
        for (int i = 0; i < count; i++) {
            leaders[i] = temp[count - i - 1]; // Reverse the order
        }

        return leaders;
    }
}
