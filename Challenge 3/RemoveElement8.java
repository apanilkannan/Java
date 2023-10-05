package com.hello.core.P3;
public class RemoveElement8 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int elementToRemove = 3;
        System.out.println("Original Array:");
        printArray(originalArray);
        int[] modifiedArray = removeElement(originalArray, elementToRemove);
        System.out.println("\nArray after removing " + elementToRemove + ":");
        printArray(modifiedArray);
    }
    public static int[] removeElement(int[] arr, int element) {
        int indexToRemove = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove == -1) {
            return arr; 
        }
        int[] modifiedArray = new int[arr.length - 1];
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != indexToRemove) {
                modifiedArray[newIndex++] = arr[i];
            }
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