package com.hello.core.P3;
public class Array2  {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 45, 9, 8, 90, 3, 1 };
        if (arr.length < 3 || arr.length < 2) {
            System.out.println("Array should have at least 3 elements for third largest and 2 elements for second smallest.");
            return;
        }
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if (arr[i] > thirdMax && arr[i] != firstMax && arr[i] != secondMax) {
                thirdMax = arr[i];
            }
            if (arr[i] < firstMin) {
                secondMin = firstMin;
                firstMin = arr[i];
            } else if (arr[i] < secondMin && arr[i] != firstMin) {
                secondMin = arr[i];
            }
        }
        System.out.println("Third Largest Element: " + thirdMax);
        System.out.println("Second Smallest Element: " + secondMin);
    }
}
