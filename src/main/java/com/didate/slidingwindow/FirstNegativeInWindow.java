package com.didate.slidingwindow;

public class FirstNegativeInWindow {

    /**
     * Given an array A[] of size N and a positive integer K, 
     * find the first negative integer for each and every window(contiguous subarray) of size K.
     * N = 5
     * A[] = {-8, 2, 3, -6, 10}
     * K = 2
     * Output : 
     * -8 0 -6 -6
     * Explanation :
     * First negative integer for each window of size k
     * {-8, 2} = -8
     * {2, 3} = 0 (does not contain a negative integer)
     * {3, -6} = -6
     * {-6, 10} = -6
     */
    public static int[] firstNegativeInWindow(int[] arr, int k) {
        int len = arr.length-k+1;
        int[] result = new int[len];
        
        for(int i=0; i<len; i++){
            int val = 0;
            for(int j=i; j<i+k; j++){
                if(arr[j]<0){
                    val = arr[j];
                    break ;
                }
            }
            result[i]= val ;
        }
        return result;
    }
    
}
