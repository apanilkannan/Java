package com.hello.core.P3;
public class Duplicate5  {
    public static void main(String[] args) {
        int[] originalArray = {1,2,3,2,4,5,6,4,7,8,9,9};
        int[] uniqueArray = removeDuplicates(originalArray);
        System.out.println("Elements:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
    public static int[] removeDuplicates(int[] arr) {
        int[] uniqueArray = new int[arr.length];
        int uniqueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[uniqueCount++] = arr[i];
            }
        }
        int[] result = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueArray[i];
        }
        return result;
    }
}
