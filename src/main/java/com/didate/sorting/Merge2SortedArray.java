package com.didate.sorting;

public class Merge2SortedArray {
    

    public static int[] merge(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] res = new int[n1+n2];

        int i =0, j=0, k=0;
        // int[] arr1 = {1, 3, 5};
        //int[] arr2 = {3, 4, 5};
        while(i<n1 && j<n2){
            if(arr1[i] < arr2[j]){
                res[k++]= arr1[i++];
            }else if(arr2[j] < arr1[i]){
                res[k++] = arr2[j++];
            }else{
                res[k++] = arr1[i++];
                res[k++] = arr2[j++];
            }
        }

        while (i <n1) {
            res[k++]= arr1[i++];
        }

        while (j <n2) {
            res[k++]= arr2[j++];
        }

        return res;
    }
}
