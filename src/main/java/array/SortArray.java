package array;

import java.util.Arrays;

import org.junit.Test;

public class SortArray {
	/* Pseudo code - Bubble Sort 
	 
	 1. use two for loops
	 2. outer loop from i=0 to <length
	 3. inner loop from j = i+1 to < length
	 4. check if (num[i]>nums[j])
	 5. If yes, swap the numebrs. else check next number till the last element in array
	 6. Return array;
	  
	  
	 */
	
	@Test
	public void test(){
		int[] num = {1,2,0,1,2};
		int[] sortArray = sortArray(num);
		System.out.println(Arrays.toString(sortArray));
		String.valueOf(num);

		
	}
	
	//Brute force
	public int[] sortArray(int[] num){
		
		for(int i=0;i<num.length;i++){
			
			for(int j=i+1;j<num.length;j++){
				
				if(num[i]>num[j]){
					int temp = num[i];
					num[i] = num[j];
					num[j]= temp;
				}
				
			}
		}
		
		
		return num;
		
	}

}
