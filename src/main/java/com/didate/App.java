package com.didate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
        SlidingWindows slidingWindows = new SlidingWindows();
        int[] nums ={9, 1, 2, 7, 4, 2, 1, 1, 5};
        System.out.println(slidingWindows.lengthLongestSubarraySumLessThanEqualK(nums, 8));
    
       


    }
}
