package com.hello.core.P3;
import java.util.Scanner;
public class Insert9  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] originalArray = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            originalArray[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to insert: ");
        int elementToInsert = scanner.nextInt();
        System.out.print("Enter the index at which to insert the element: ");
        int indexToInsert = scanner.nextInt();
        System.out.println("\nOriginal Array:");
        printArray(originalArray);
        int[] modifiedArray = insertElement(originalArray, elementToInsert, indexToInsert);
        System.out.println("\nArray after inserting " + elementToInsert + " at index " + indexToInsert + ":");
        printArray(modifiedArray);
        scanner.close();
    }
    public static int[] insertElement(int[] arr, int element, int index) {
        int[] modifiedArray = new int[arr.length + 1];
        for (int i = 0; i < index-1; i++) {
            modifiedArray[i] = arr[i];
        }
        modifiedArray[index-1] = element;
        for (int i = index-1; i < arr.length; i++) {
            modifiedArray[i + 1] = arr[i];
        }
        return modifiedArray;
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}