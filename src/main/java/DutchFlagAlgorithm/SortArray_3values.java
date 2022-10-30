package DutchFlagAlgorithm;

import java.util.Arrays;

import org.junit.Test;

public class SortArray_3values {
	/* Problem: If array is having only three range of values, and output is static order, we can use this algo */
	
	/* Testdata:
		
		Example1:
			input = [1,2,0,1,2]; Input always contains 0,1,2
			output = [0,1,1,2,2]
		Example2:
			input = ["red", "blue", "red", "white"];
			output = ["white", "blue", "red", 'red"];
			
	*/
	
	/* Pseudo code: eg for 0,1,2 numbers;
	 
	 1. Initialize lowPointer = 0, middlePointer=0, highPointer=length-1;
	 2. If the array[middlePointer] = 0, Swap the middlepointer and lowpointer values. Increment both the pointer
	 3. If the array[middlePointer] = 1, increment the middle pointer;
	 4. If the array[middlePointer] = 2, Swap the middlepointer and highpointer values. Decrement high pointer
	 5. Break the loop when middlepointer crosses the high pointer;
	 
	 */
	
	@Test
	public void example1(){
		int[] nums = {1,2,0,1,2};
		int[] outputArray = sortArray_DutchFlag(nums);
		System.out.println(Arrays.toString(outputArray));
		
	}
	
	@Test
	public void example2(){
		int[] nums = {1,2,0,1,2,0,0,0,0,1,1,1,2};
		int[] outputArray = sortArray_DutchFlag(nums);
		System.out.println(Arrays.toString(outputArray));
		
	}
	
	public int[] sortArray_DutchFlag(int[] nums){
		
		int lowPointer=0, midlePointer=0, highPointer=nums.length-1;
		
		while(midlePointer <= highPointer){
			
			if(nums[midlePointer]==0){
				int temp = nums[lowPointer];
				nums[lowPointer]=nums[midlePointer];
				nums[midlePointer] = temp;
				midlePointer++;
				lowPointer++;
			} else if(nums[midlePointer]==1) {
				midlePointer++;
				
			} else{
				int temp=nums[highPointer];
				nums[highPointer] = nums[midlePointer];
				nums[midlePointer] = temp;
				highPointer--;
			}
			
			
			
		}
		
		return nums;
		
	}
			          
			
	         

}
