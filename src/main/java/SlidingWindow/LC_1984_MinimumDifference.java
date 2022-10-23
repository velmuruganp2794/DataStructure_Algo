package SlidingWindow;

import java.util.Arrays;

import org.junit.Test;

public class LC_1984_MinimumDifference {
	
	/*Problem:
		You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. 
		You are also given an integer k.
		Pick the scores of any k students from the array 
		so that the difference between the highest and the lowest of the k scores is minimized.
		Return the minimum possible difference.*/
	
	/*Test data:
		Example 1:

			Input: nums = [90], k = 1
			Output: 0
		Example 2:

			Input: nums = [9,4,1,7], k = 2
			Output: 2
			*/
	
	/*
	Pseudo Code: BruteForce Approach
	1. Set minimum = Integer.MAX_VALUE
	2. Traverse elements in array from 0 to end-1;
    3. Traverse in inner loop from j=k-1 
    4. Find Math.min (minimum , nums[j]-nums[i])
    5. Re-assign minimum to nums[j]-nums[j], if minimum > nums[j]-nums[i]
    6. Return minimum;		
    */
	
	/*
	Pseudo Code: Sliding Approach.
	1. Set minimum = 0, pointer=0
	2. Find difference for first window and set it as minimum nums[k-1] - nums[pointer++]
	3. traverse element from j=k as maximum and pointer index as minimum
	4. find the difference	and compare with minimum value
	5. re-assign minimum as nums[j] - nums[pointer] if it is less than available minimum
	6. return minimum
    */
	
	/*
	 * Time Complexity = O(n-k) or O(n)
	 * Space Complexity = O(n) or O(1)
	 */
	
	@Test
	public void positive(){
		
		int[] array= {9,4,1,7};
		int minimumDifference = minimumDifference_Sliding(array, 2);
		System.out.println(minimumDifference);
	}
		
		//Brute Force
	public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minimum=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
        	System.out.println("i"+i);

            for(int j=i+k-1;j<nums.length;j++){
            	System.out.println("i="+i+", j="+j);
                minimum = Math.min(minimum, nums[j]-nums[i]);
            }
        }
        return minimum;
    }
	
	public int minimumDifference_Sliding(int[] nums, int k) { // 1 , 4, 7, 9
        Arrays.sort(nums);
        int minimum=0, pointer=0;

        //Find minimum to first window
        minimum = nums[k-1]-nums[pointer++];
        
        // Check for next window
        System.out.println(minimum);
        for(int j=k;j<nums.length;j++){
        	System.out.println("j="+j+", pointer="+pointer);

            minimum = Math.min(minimum,nums[j]-nums[pointer]);
            System.out.println(minimum);
            pointer++;

        }
        return minimum;
    }
			
}
