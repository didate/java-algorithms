package com.didate.recursivity;

public class BinarySearch {

    public int search(int[] arr, int target, int left, int right) {

        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;

        if (target == arr[middle]) {
            return middle;
        }

        if (target > arr[middle]) {
            return search(arr, target, middle + 1, right);
        }

        return search(arr, target, left, middle - 1);
    }
}
