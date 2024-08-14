package com.didate.slidingwindow;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MaxOfSubarrays {

    private MaxOfSubarrays(){}

    /**
     * Function to find maximum of each subarray of size k.
     */
    public static List<Integer> maxOfSubarrays(int[] arr, int n, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (n == 0) {
            return result;
        }

        int max = arr[0];

        for (int i = 1; i < k; i++) {
            max = Math.max(max, arr[i]);
        }
        result.add(max);

        int windowRight = k;
        int windowLeft = 0;

        while (windowRight < n) {
            if (max > arr[windowLeft]) {
                max = Math.max(max, arr[windowRight]);
                result.add(max);
            } else {
                max = arr[windowLeft + 1];
                for (int i = windowLeft + 1; i <= windowRight; i++) {
                    max = Math.max(max, arr[i]);
                }
                result.add(max);
            }
            windowLeft++;
            windowRight++;
        }
        return result;
    }

    /**
     * Function to find maximum of each subarray of size k.
     */
    static ArrayList <Integer> maxOfSubarrays2(int[] arr, int n, int k)
    {
        ArrayList<Integer> result = new ArrayList<>();
        TreeSet<Integer> sortedSet = new TreeSet<>();
        int count =0;
        for(int i=0; i<n; i++){
            
            sortedSet.add(arr[i]);
            count++;
            if(count ==k){
                result.add(sortedSet.last());
                sortedSet.pollFirst();
                count--;
            }
        }
        return result;
    }
}
