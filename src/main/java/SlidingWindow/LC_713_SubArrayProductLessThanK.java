package SlidingWindow;

public class LC_713_SubArrayProductLessThanK {
	
	/* Problem: 
	  Given an array of integers nums and an integer k, return the number of contiguous subarrays 
	  where the product of all the elements in the subarray is strictly less than k.
	  
	  Test data:
	
	  Input: nums = [10,5,2,6], k = 100
      Output: 8
      Explanation: The 8 subarrays that have product less than 100 are:
      [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
      Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
      
      */

	
	 /*  Pseudo code: BruteForce;
    1. let count=0 Traverse elements with two for loops.
    2. Outer loop with i=0 to nums.length , also declare product as 1 for each iteration.
    3. Inner loop with j=i to nums.length
    4. find the product of different combination
    5. if the product is less than target, increment count.
    6. outside of outer loop, return count;
    */
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int count=0, product;
        for(int i=0;i<nums.length;i++){        
             product=1;
            for(int j=i;j<nums.length;j++){          
                product *=nums[j];
              
                if(product < k) count++;
                else break;

            }
        }
        return count;
        
    }
    
    
    /* Sliding Window;
    1. let count =0, product=1, left=0, right=0
    2. Traverse nums[i] elements, find products*=nums[i];
    3. If multiplication is > k, divide by nums[left], increment left+1
    4. if multiplication < k, count=right-left+1
    5. Return count;
    */

    /* Time Complexity = O(n+k), space Complexity = O(1) */
    
    public int numSubarrayProductLessThanK_Sliding(int[] nums, int k) {
         
         if(k<=1) return 0;
      
      int count=0, product=1, left=0, right=0;
      for(right=0;right<nums.length;right++){    
          
         product *=nums[right];
        
        while(product>=k){
            product = product/nums[left];
            left++;
        }
       if(product<k) count +=right-left+1;
       
      }
      
      return count;
    
}

}
