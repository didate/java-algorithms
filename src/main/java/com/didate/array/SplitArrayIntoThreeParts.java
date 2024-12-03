package com.didate.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array, arr[], determine if arr can be split into three consecutive 
 * parts such that the sum of each part is equal. 
 * If possible, return any index pair(i, j) in an array such that 
 * sum(arr[0..i]) = sum(arr[i+1..j]) = sum(arr[j+1..n-1]), otherwise return an array {-1,-1}
 */
public class SplitArrayIntoThreeParts {
    
    public List<Integer> findSplit(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            totalSum += arr[i];
        }
        
        if(totalSum % 3 != 0){
            return new ArrayList<>(List.of(-1, -1));
        }
        
        int targetSum = totalSum / 3;
        int prefixSum = 0;
        int nbPart = 0;
        
        
        for(int i=0; i<n; i++){
            prefixSum += arr[i];
            
            if(prefixSum == targetSum){
                nbPart +=1;
                result.add(i);
                prefixSum = 0;
            }
            
            if(nbPart == 2){
                break;
            }
        }
        
        if(nbPart == 2){
            return result;
        }
        return new ArrayList<>(List.of(-1, -1));
    }
}
