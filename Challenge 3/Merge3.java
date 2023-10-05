package com.hello.core.P3;
public class Merge3  {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        int[] mergedArray = merge(arr1, arr2);
        System.out.print("Merged Array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
    public static int[] merge(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] mergedArray = new int[length1 + length2];
        for (int i = 0; i < length1; i++) {
            mergedArray[i] = arr1[i];
        }
        for (int i = 0; i < length2; i++) {
            mergedArray[length1 + i] = arr2[i];
        }
        return mergedArray;
    }
}
