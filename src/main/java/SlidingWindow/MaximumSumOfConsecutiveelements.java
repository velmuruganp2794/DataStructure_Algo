package SlidingWindow;

import org.junit.Test;

public class MaximumSumOfConsecutiveelements {
	
	/*Test data:
		Positive:
		intput array = {1,5,2,3,7,1}
         K = 3
        		 
        Edge:
        	Input array = {1,0,1,-5,3,4,7}
	     K=3*/
	
	
	/*Pseudo code: Approach 1:
		1. set maximumsum as Integer_Min
		2. Find number of windows based on consecutive element
		3. traverse each window in outer loop, set currennt sum = 0;
		4. inner loop with comdition J< K element
		5. add each elemnt with current sum
		6. Compare current sum with maximum sum , replace maximum sum.*/
	
	/*TimeComplexity = O(m+n)
	SpaceComplexity = O(n)	*/	
			
	
	@Test
	public void Positive(){
		int[] array = {1,5,2,3,7,1};
		int k = 3;
		int maximumSum = maximumSumOfConEle(array, k);
		System.out.println(maximumSum);
		
		
	}
	
	@Test
	public void Edge(){
		int[] array = {1,0,1,-5,3,4,7};
		int k = 3;
		int maximumSum = maximumSumOfConEle(array, k);
		System.out.println(maximumSum);
		
		
	}
	
	
	public int maximumSumOfConEle(int[] arr, int k){
		
		int totalWindow = arr.length-k+1;
		
		int MaximumSum = Integer.MIN_VALUE;
		for(int i=0;i<totalWindow;i++){
			
			int currentSum = 0;
			for(int j=0;j<k;j++){
				currentSum = currentSum+arr[i+j];
			}
			
			if(MaximumSum < currentSum)
				MaximumSum = currentSum;
		}
		
		return MaximumSum;
		
		
	}
	
 

}
