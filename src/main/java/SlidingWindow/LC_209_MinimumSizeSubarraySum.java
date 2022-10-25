package SlidingWindow;

import org.junit.Test;

public class LC_209_MinimumSizeSubarraySum {
	
	/*
	 Problem: 
	 Given an array of positive integers nums and a positive integer target, 
	 return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] 
	 of which the sum is greater than or equal to target. 
	 If there is no such subarray, return 0 instead.
	 */
	
	/*Testdata:
		
		Example 1:

			Input: target = 7, nums = [2,3,1,2,4,3]
			Output: 2
			Explanation: The subarray [4,3] has the minimal length under the problem constraint.
			Example 2:

			Input: target = 4, nums = [1,4,4]
			Output: 1
			Example 3:

			Input: target = 11, nums = [1,1,1,1,1,1,1,1]
			Output: 0*/
	
	/*Pseudo code:
		1. let left=0, right=0, sum=0, min=Integer_MAX_VALUE
		2. traverse elements in nums[] from right and add it sum
		3. If sum>=target, find min distance as right-left. 
		4. remove nums[left] from sum. do this until sum>=target.
		4. if(sum<target) add right side element to sum. rigt++
		5. return min distance*/
	
	@Test
	public void positive(){
		int[] nums = {2,3,1,2,4,3};
		int target=7;
		minSubArrayLen(target, nums);
	}
	
	public int minSubArrayLen(int target, int[] nums) {

        int left=0, right=0, minLength=Integer.MAX_VALUE, sum=0;
        
        while(right<nums.length){
        	
        	sum+=nums[right];
        	right++;
        	while(sum>=target){
        		
        		minLength = Math.min(minLength, right-left);
        		sum-=nums[left++];
        	}
        	
        	
        }
        if(minLength == Integer.MAX_VALUE)
            return 0;
        return minLength;

        
	
	
	}

}
