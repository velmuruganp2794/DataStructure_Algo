package SlidingWindow;

import org.junit.Test;

public class LC_1004_MaxConsecutiveOnes {
	
	/*Problem: 
		Given a binary array nums and an integer k, 
		return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
*/
	
	
	/* Test data:
		Example1;
    Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
    Output: 6
    Explanation: [1,1,1,0,0,1,1,1,1,1,1]
    Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.*/
	
	/* Pseudo code:
    1. Let start=0, end=0, zeroCount=0, MaxConsOnes=0
    2. Traverse elements in array using end pointer and find the zero count
    3. if zero count is greater than k, remove zero count by incrementing start position.
    4. find the maximum consecutive one using Math.max(MaxConsOnes, end-start);
    5. return MaxConsOnes;

    */
	
	/* Time Complexity = O(n+m)
	   Space Complexity = O(1)
	 */
	
	@Test
	public void example1(){
		int nums[]={1,1,1,0,0,0,1,1,1,1,0};
		int k=2;
		int longestOnes = longestOnes(nums, k);
		System.out.println(longestOnes);
		
	}
	
	public int longestOnes(int[] nums, int k) {
		
		int start=0, zeroCount=0, maxLengthOfOnes=0;
		
		for(int end=0;end<nums.length;end++){
			
			if(nums[end]==0) zeroCount++;
			
			while(zeroCount>k){
				if(nums[start]==0)
					zeroCount--;
				start++;
			}
			
            maxLengthOfOnes = Math.max(maxLengthOfOnes, end-start+1);
			
			
		}
		
		
		return maxLengthOfOnes;

	}
	
	
		
		
}
