package com.didate.array;

public class RotateArray {
    

    public int[] rotateByOne(int[] arr){

        int tmp = arr[0];

        for(int i=1; i < arr.length; i++){
            arr[i-1]= arr[i];
        }
        arr[arr.length -1] = tmp;
        return arr;
    }

    public int[] rotateByD(int[] arr, int d){

        int n = arr.length;
        d= d % n;

        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);

        return arr;
    }

    public void reverse(int[] arr, int begin, int end){

        while(begin < end){
            int tmp = arr[begin];
            arr[begin]= arr[end];
            arr[end] = tmp;
            begin++;
            end--;
        }
    }
}
