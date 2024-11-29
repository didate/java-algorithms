package com.didate.array;

import java.util.ArrayList;
import java.util.List;

public class FrequencyInSortedArray {
    
    public List<Integer> findFrequency(int[] arr){
        List<Integer> res = new ArrayList<>();
        int count =0; 
        int current = arr[0];

        for(int i=0; i< arr.length; i++){
            if(arr[i] == current){
                count++;
            }else{
                res.add(count);
                current = arr[i];
                count =1;
            }
        }
        res.add(count);
        return res;
    }
}
