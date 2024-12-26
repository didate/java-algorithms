package com.didate.sorting;

public class SelectionSort {

    public static void sort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n; i++){
            int indexMin = SortUtils.min(arr, i);

            if(indexMin != i){
                SortUtils.swap(arr, i, indexMin);
            }
        }
    }
    
}
