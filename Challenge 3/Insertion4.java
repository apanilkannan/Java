package com.hello.core.P3;
public class Insertion4 {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 };
        System.out.println("Original Array:");
        printArray(arr);
        insertionSort(arr);
        System.out.println("\nSorted Array:");
        printArray(arr);
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}