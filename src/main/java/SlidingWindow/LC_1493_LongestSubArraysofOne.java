package SlidingWindow;

import org.junit.Test;

public class LC_1493_LongestSubArraysofOne {
	/* Problem: 
	https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
	*/

	/* Pseudo code:
	1. int start=0, end=0, ZeroCount=0, Maxlength=0;
	2. Traverse elements in array from end=0 to end<nums.length
	3. while zero count is > 1, check nums[start]==0, if yes, reduce zero count and increment start. else increment start.
	4. find maxlength = end-start. (No +1, since we are deleting one element)
	*/
	
	/* Test data
	 
	 Example 1:

     Input: nums = [1,1,0,1]
     Output: 3
     Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
	 
	 Example 2:
	 Input: nums = [0,1,1,1,0,1,1,0,1]
     Output: 5
     Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1]
	 
	 
	 Input: nums = [1,1,1]
     Output: 2
     Explanation: You must delete one element.
     
     
	 */
	
	/* Time Complexity = O(n+k)
	  Space Complexity = O(1)
	 */
	
	//@Test
	public void example1(){
		int[] nums = {1,1,0,1};
		int longestSubarrayLength = longestSubarray(nums);
		System.out.println(longestSubarrayLength);
			
	}
	
	//@Test
	public void example2(){
		int[] nums = {0,1,1,1,0,1,1,0,1};
		int longestSubarrayLength = longestSubarray(nums);
		System.out.println(longestSubarrayLength);
			
	}
	
	@Test
	public void example3(){
		int[] nums = {1,1,1,1};
		int longestSubarrayLength = longestSubarray(nums);
		System.out.println(longestSubarrayLength);
			
	}
	
	@Test
	public void example4(){
		int[] nums = {0,0,0};
		int longestSubarrayLength = longestSubarray(nums);
		System.out.println(longestSubarrayLength);
			
	}
	
	@Test
	public void example5(){
		int[] nums = {0,0,1};
		int longestSubarrayLength = longestSubarray(nums);
		System.out.println(longestSubarrayLength);
			
	}
	
	public int longestSubarray(int[] nums) {

        int start=0, end=0, zeroCount=0, maxLength=0;

        for(;end<nums.length;end++){

            if(nums[end]!=1) zeroCount++;

            while(zeroCount>1){
                if(nums[start]==0) zeroCount--;
                start++;

            }
            maxLength = Math.max(maxLength,end-start);
        }   
        return maxLength;
    }
	

}
