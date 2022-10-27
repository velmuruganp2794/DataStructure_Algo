package bruteForce;

import org.junit.Test;

public class LC_713_SubArrayProductLessThanK {
	
	@Test
	public void example1(){
		
		int[] nums = {10,5,2,6};
		int numSubarrayProductLessThanK = numSubarrayProductLessThanK(nums, 100);
		System.out.println(numSubarrayProductLessThanK);
		
	}
	
	 public int numSubarrayProductLessThanK(int[] nums, int k) {

	        int count=0, product;
	        for(int i=0;i<nums.length;i++){
	            System.out.println("I = " +i);
	            product=1;
	            for(int j=i;j<nums.length;j++){
	                
	               System.out.print(" J = " +j);
	                product *=nums[j];
	                System.out.print(" Product"+product);
	                if(product < k) count++;
	                else break;

	            }
	        }
	        return count;
	        
	    }

}
