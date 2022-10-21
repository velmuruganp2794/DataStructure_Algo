package twopointer;

import java.util.HashSet;

import org.junit.Test;

public class LC_2367_ArithmaticTriplets {
	
	/* Problem:
		
	You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. 
	A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

		i < j < k,
		nums[j] - nums[i] == diff, and
		nums[k] - nums[j] == diff.
		Return the number of unique arithmetic triplets.
		
		*/
	
	/*Testdata:
		
		Positive:
			Input: nums = [0,1,4,6,7,10], diff = 3
			Output: 2
			Explanation:
			(1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
			(2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3.
			
		Negative:
			Input: nums = [4,5,6,7,8,9], diff = 2
			Output: 2
			Explanation:
			(0, 2, 4) is an arithmetic triplet because both 8 - 6 == 2 and 6 - 4 == 2.
			(1, 3, 5) is an arithmetic triplet because both 9 - 7 == 2 and 7 - 5 == 2.
*/
	
	/*Pseudo Code:
		1. Add all the array elements into set. Set count=0;
		2. Use for loop to traverse element in the array.
		3. check if set contains nums[i]+diff && nums[i]+(2*diff)
		4. If yes increment count
		5. return count
		
		
		*/
	
	/*
	TimeComplexity = O(n)
    Space complexity (n)
    */
		
	@Test
	public void positive(){
		
		int[] array= {0,1,4,6,7,10};
		int diff=3;
		System.out.println(arithmeticTriplets(array, diff));
				
		
	}
	
	@Test
	public void negative(){
		int[] array= {0,1,4,6,7,10};
		int diff=5;
		System.out.println(arithmeticTriplets(array, diff));
	}
	
	
	public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num:nums){
             set.add(num);
        }

       for(int i=0;i<nums.length;i++){

             if(set.contains(nums[i]+diff) && set.contains(nums[i]+(2*diff))){
                 count++;
             }

       } 
       return count;
    }
	
	
	
	
}
