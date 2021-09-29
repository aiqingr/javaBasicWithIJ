package com.algo;

import java.util.Arrays;

public class BSAwesome {
    public static int getLessIndex(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (arr.length == 1 || arr[0] < arr[1]) {
            return 0;
        }
        if (arr[arr.length - 1] < arr[arr.length - 2]) {
            return arr.length - 1;
        }
        int left = 1;
        int right = arr.length - 2;
        int mid = 0;
        while (left < right) {
            mid = left + ((right - left) >> 1);
            if (arr[mid] > arr[mid - 1]) {
                right = mid - 1;
            } else if (arr[mid] > arr[mid + 1]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }

    public static int[] generateRandomArray(int sizeMax, int valueMax) {
        int[] arr = new int[(int) ((sizeMax + 1) * (Math.random()))];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = (int) ((valueMax + 1) * (Math.random()) - (int) (valueMax * (Math.random())));
        }
        return arr;
    }

    public static void main(String[] args) {
        int testTime = 10000;
        int sizeMax = 10;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr = generateRandomArray(sizeMax, maxValue);
            int value = getLessIndex(arr);
            if (arr[value] > arr[value - 1] || arr[value] > arr[value + 1]) {
                succeed = false;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
    }
}
