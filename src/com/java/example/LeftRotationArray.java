package com.java.example;

public class LeftRotationArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int d = 4;
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + n - d) % n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }

    }
}
