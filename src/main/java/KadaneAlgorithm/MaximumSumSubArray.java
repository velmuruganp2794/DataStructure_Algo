package KadaneAlgorithm;

import org.junit.Test;

public class MaximumSumSubArray {
	/* Maximum Sum continous sub array */
	
	/*Test data 
	Input = {-2,1,-3,4,-1,2,1,-5,4};
	output = 6*/
	
	/* 
	Pseudo code
	1. Initialize Maximum=0, currentSum=0;
	2. Traverse elemnt from 0th to length-1 index
	3. if the current sum is < 0, then re-assign the current sum=0.
	4. Find Math.max(maximum,currentsum) 
	 */
	
	/* Condition: We should have one zero/positive integer in the array */
	
	/*Time Complexity = O(n), Space Complexity = O(1) */
	
	@Test
	public void testdata1(){
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int maximumSum = maximumSum(nums);
		System.out.println(maximumSum);
		
	}
	
	public int maximumSum(int[] nums) { //{-2,1,-3,4,-1,2,1,-5,4};
		int maximum = 0, currentSum = 0;

		for (int i = 0; i < nums.length; i++) {
			currentSum = currentSum + nums[i];

			if (currentSum < 0)
				currentSum = 0;
			else
				maximum = Math.max(maximum, currentSum);

		}

		return maximum;
	}
	
	

}
