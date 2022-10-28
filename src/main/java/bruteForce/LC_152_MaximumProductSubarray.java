package bruteForce;

public class LC_152_MaximumProductSubarray {
	
	/* Problem: 
	 * Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
       The test cases are generated so that the answer will fit in a 32-bit integer.
       A subarray is a contiguous subsequence of the array.
	 */
	
	/* Pseudo code: Brute Force
	  1. let i=0, j=0,  MaxProduct=Integer.MIN_VALUE;
	  2. Traverse elements in array in outer for loop (set product =1)
	  3. Traverse elenments in inner loop where j=i
	  4. find product = product * nums[j]
	  5. find the maximum product using Math.max(product, MaxProduct)
	  6. return MaxProduct
	  */

	  /*
	  Time complexity = O(n^2)
	  Space complexity = O(1)
	  */
	    public int maxProduct(int[] nums) {
	        int maxProduct=Integer.MIN_VALUE, product;
	        for(int i=0;i<nums.length;i++){
	            product=1;
	            for(int j=i;j<nums.length;j++){
	                product=product*nums[j];
	               
	                maxProduct = Math.max(product, maxProduct);
	            }
	        }
	        return maxProduct;

	    }

}
