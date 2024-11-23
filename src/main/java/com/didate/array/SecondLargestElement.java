package com.didate.array;


/**
 * Given an array of positive integers arr[], return the second largest element from the array. 
 * If the second largest element doesn't exist throw an exception with "No second largest element found".
 */
public class SecondLargestElement {
    
    public int findSecondLargest(int[] arr){

        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int e : arr){

            if(e > largest){
                secondLargest = largest;
                largest = e;
            }else if (e > secondLargest && e != largest) {
                secondLargest = e;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found");
        }

        return secondLargest;
    }
}
