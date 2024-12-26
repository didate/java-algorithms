package com.didate.array;

import java.util.*;

public class MinimumMissingPositive {
    

    public int missingNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 1;
        }

        Set<Integer> pos = new HashSet<>();
        for (Integer e : arr) {
            if(e > 0){
                pos.add(e);
            }
        }

        int missingNumber =1;

        while(pos.contains(missingNumber)){
            missingNumber++;
        }
        return missingNumber;
    }
}
