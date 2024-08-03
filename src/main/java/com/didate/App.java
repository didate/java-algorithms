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
    
        int[] nums2 ={1,1,0,1,1,0,0,1,1,1};
        System.out.println(slidingWindows.lengthOfLongestSubarrayContaining0(nums2));
    
        int[] nums3 = {10, 5, 2, 6};
        System.out.println(slidingWindows.numSubarrayProductLessThanK(nums3,100));


    }
}
