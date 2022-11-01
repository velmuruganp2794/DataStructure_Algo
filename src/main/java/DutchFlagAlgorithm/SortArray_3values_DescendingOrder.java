package DutchFlagAlgorithm;

import java.util.Arrays;

import org.junit.Test;

public class SortArray_3values_DescendingOrder {
	/* Problem: If array is having only three range of values, and output is static order, we can use this algo */
	
	/* Testdata:
		
		Example1:
			input = [1,2,0,1,2]; Input always contains 0,1,2
			output = [2,2,1,1,0]
			
		Example2:
			input = ["red", "blue", "red", "white"];
			output = ["white", "blue", "red", 'red"]; // descending order
			
	*/
	
	/* Pseudo code: eg for 0,1,2 numbers;
	 
	 1. Initialize lowPointer = length-1, middlePointer=length-1, highPointer=0;
	 2. If the array[middlePointer] = 0, Swap the middlepointer and lowpointer values. Decrement both the pointer
	 3. If the array[middlePointer] = 1, Decrement the middle pointer;
	 4. If the array[middlePointer] = 2, Swap the middlepointer and highpointer values. Increment high pointer
	 5. Break the loop when middlepointer crosses the high pointer;
	 
	 */
	
	@Test
	public void example1(){
		int[] nums = {1,2,0,1,2};
		int[] outputArray = sortArray_DutchFlag_DescendingOrder(nums);
		System.out.println(Arrays.toString(outputArray));
		
	}
	
	@Test
	public void example2(){
		int[] nums = {1,2,0,1,2,0,0,0,0,1,1,1,2};
		int[] outputArray = sortArray_DutchFlag_DescendingOrder(nums);
		System.out.println(Arrays.toString(outputArray));
		
	}

	@Test
	public void example3(){
		int[] nums = {1,2,0,1,2,0,0,0,0,2,2,2,2,2,2};
		int[] outputArray = sortArray_DutchFlag_DescendingOrder(nums);
		System.out.println(Arrays.toString(outputArray));

	}
	
	public int[] sortArray_DutchFlag_DescendingOrder(int[] nums){
		
		int lowPointer=nums.length-1, midlePointer=nums.length-1, highPointer=0;
		
		while(midlePointer >= highPointer){
			
			if(nums[midlePointer]==0){
				int temp = nums[lowPointer];
				nums[lowPointer]=nums[midlePointer];
				nums[midlePointer] = temp;
				midlePointer--;
				lowPointer--;
			} else if(nums[midlePointer]==1) {
				midlePointer--;
				
			} else{
				int temp=nums[highPointer];
				nums[highPointer] = nums[midlePointer];
				nums[midlePointer] = temp;
				highPointer++;
			}
			
			
			
		}
		
		return nums;
		
	}
			          
			
	         

}
