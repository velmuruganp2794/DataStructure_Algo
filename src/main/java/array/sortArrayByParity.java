package array;

import java.util.Arrays;

public class sortArrayByParity {

	public static void main(String[] args) {
		sortArrayByParity obj = new sortArrayByParity();
		obj.sortArrayByParity_(new int[] {2,3,2,4,7});

	}
	
	 public int[] sortArrayByParity(int[] nums) {

	       int[] output = new int[nums.length];
	          int start=0;
	          int end=nums.length-1;

	        for(int i=0;i<nums.length;i++){
	          
	          if((nums[i]%2)==0 || nums[i]==0){
	              output[start]=nums[i];
	              start++;
	          } else{
	              output[end]=nums[i];
	              end--;
	          }


	        }
	        return output;
	        
	    }
	 
	 public int[] sortArrayByParity_(int[] A) {
	        int i = 0, j = A.length - 1;
	        while (i < j) {
	            if (A[i] % 2 > A[j] % 2) {
	                int tmp = A[i];
	                A[i] = A[j];
	                A[j] = tmp;
	            }

	            if (A[i] % 2 == 0) i++;
	            if (A[j] % 2 == 1) j--;
	        }

	        return A;
	    }
	 
	 

}
