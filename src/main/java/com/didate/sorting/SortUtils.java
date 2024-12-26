package com.didate.sorting;

public class SortUtils {

    private SortUtils(){}
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static int min(int[] arr){
        int indexMin = 0;

        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                indexMin = i;
            }
        }
        return indexMin;
    }

    public static int min(int[] arr, int begin){
        int indexMin = begin;

        for(int i=begin+1; i<arr.length; i++){
            if(arr[i] < arr[indexMin]){
                indexMin = i;
            }
        }
        return indexMin;
    }
}
