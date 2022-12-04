package twopointer;

import org.junit.Test;

public class LC_27_RemoveElementinArray {

	/* Pseudocode
	1. Declare start=0, end equal to length-1;
	2. Traverse each element in array
	3. if nums[start] equal to val, assign end value to start and decrement end
	4. if nums[start] not equal to val, increment start
	5. do the same till start<=end
	6. return end+1;
	 */
     @Test
	public void testdata1(){
		int[] nums = {3,2,2,3};
		int val = 3;
		//Output: 2, nums = [2,2,_,_]
		// System.out.println(removeElement_Optimized(nums,val));
		 System.out.println(removeElement_Optimized1(nums,val));
	}

	@Test
	public void testdata2(){
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		//Output: 5
		//System.out.println(removeElement_Optimized(nums,val));
		System.out.println(removeElement_Optimized1(nums,val));
	}

	public int removeElement_Optimized(int[] nums, int val) {
		int left = 0;
		int right = nums.length-1;
		if(nums.length==0) return 0;
		while (left <= right) {
			if (nums[left] == val) {
				nums[left] = nums[right];
				// reduce array size by one
				right--;
			} else {
				left++;
			}
		}
		return right+1;
	}

	public int removeElement_Optimized1(int[] nums, int val) {
		int left = 0;
		int right = nums.length-1;
		if(nums.length==0) return 0;
		while (left < right) {
			if (nums[left] == val && nums[right]!=val) {
				nums[left] = nums[right];
				// reduce array size by one
				right--;
			}
			if(nums[left]!=val) left++;
			if(nums[right]==val) right--;
		}
		return right+1;
	}

}
