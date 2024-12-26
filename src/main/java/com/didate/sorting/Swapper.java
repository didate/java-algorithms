package com.didate.sorting;

public class Swapper {

    private Swapper(){}
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
