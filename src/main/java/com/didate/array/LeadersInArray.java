package com.didate.array;

import java.util.ArrayList;
import java.util.List;


/**
 * In an array, an element is called a leader if it is greater than or 
 * equal to all the elements to its right. 
 * The last element is always a leader.
 * arr = {16, 17, 4, 3, 5, 2} => res = [17, 5, 2] 
 */
public class LeadersInArray {
    
    public List<Integer> findLeaders(int[] arr){
        int n = arr.length;
        List<Integer> res = new ArrayList<>();

        res.add(arr[n-1]);
        
        for(int i=n-2; i>=0; i--){
            int current = arr[i];
            
            if(current >= res.get(0)){
                res.add(0, current);
            }
        }

        return res;
    }
}
