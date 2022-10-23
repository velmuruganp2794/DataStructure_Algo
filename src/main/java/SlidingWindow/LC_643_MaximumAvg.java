package SlidingWindow;

import java.awt.Point;

public class LC_643_MaximumAvg {
	
	/*Problem:
		
	You are given an integer array nums consisting of n elements, and an integer k.

	Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. 
   Any answer with a calculation error less than 10-5 will be accepted.

	 
Test data:
	Example 1:

	Input: nums = [1,12,-5,-6,50,3], k = 4
	Output: 12.75000
	Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
*/
	public static void main(String[] args) {
		LC_643_MaximumAvg obj = new LC_643_MaximumAvg();

		int[] arr = {1,12,-5,-6,50,3};
		double findMaxAverage = obj.findMaxAverage(arr, 4);
		System.out.println(findMaxAverage);
		
	}

	public double findMaxAverage(int[] nums, int k) {

		int sum = 0, pointer = 0;
		double maxAvg=Integer.MIN_VALUE;

		while (pointer < k) {
			sum += nums[pointer++];
		}

		maxAvg = (double) sum / k;
		//System.out.println(maxAvg);

		for (int j = k; j < nums.length; j++) {

			sum += nums[j] - nums[j-k];
			maxAvg = Math.max(maxAvg, (double)sum/k);
			

		}

		return maxAvg;

	}
}
