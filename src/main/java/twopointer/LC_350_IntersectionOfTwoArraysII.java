package twopointer;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class LC_350_IntersectionOfTwoArraysII {

	/*
	 * Problem: Given two integer arrays nums1 and nums2, return an array of
	 * their intersection. Each element in the result must appear as many times
	 * as it shows in both arrays and you may return the result in any order.
	 */

	/*
	 * Testdata:
	 * 
	 * Positive: 
	 * 
	 * Input: nums1 = [1,2,2,1], nums2 = [2,2] Output: [2,2]
	 * 
	 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] Output: [4,9] Explanation:
	 * [9,4] is also accepted
	 * 
	 * Negative:
	 * 
	 * Input: nums1 = [1,3,2,1], nums2 = [4,5] Output: []
	 * 
	 * 
	 * 
	 * 
	 */
	
	/*Psuedo Code:
		1. Sort both the Arrays
		2. let left, right = 0 
		3. traverse elements in the array and check if(nums1[left]<nums2[right]) if yes, left++
		5. else if (nums1[left]>nums2[right]) if yes right++
		6 else add it to list and left++, right++
		7. return list as array.*/
	
	/*Time Complexity: O(m+n)
	Space Complexity: O(m+n)*/
	
	
	
	@Test
	public void positive(){
		
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] intersect = intersect(nums1, nums2);
		System.out.println(Arrays.toString(intersect));
		
	}
	
	public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int left=0, right=0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(left < nums1.length && right < nums2.length){
            
            if(nums1[left] < nums2[right]) left++;
            else if (nums1[left] > nums2[right] ) right++;
            else {
            list.add(nums1[left]);
            left++;
            right++;
            }

      
       }
       int output[] = new int[list.size()];
       int k=0;
       for(int listItems:list) {
        output[k++]=listItems;
       }    
      return output;
        
    }
		

}
