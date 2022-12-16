package KadaneAlgorithm;

import org.junit.Test;

public class LC_53_MaximumSubArray {
    /*
    kandane Alg
     */

    /*Pseudo-code
    1. calculate sum of subArray numbers
    2. if sum is less than zero, reset to 0;
    3. return Sum;

     */

    @Test
    public void testdata1(){
        int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    @Test // All negative Numbers
    public void testdata2(){
        int[] nums = new int[] {-2,-1,-3,-4,-1,-2,-1,-5,-4};
        System.out.println(maxSubArray(nums));
    }

    @Test // All negative Numbers
    public void testdata3(){
        int[] nums = new int[] {-2,-1,-3,-4,0,-2,-1,-5,-4};
        System.out.println(maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, currentSum=0;

        for(int i=0;i<nums.length;i++){
            currentSum +=nums[i];

            maxSum = Math.max(maxSum,currentSum);
            if(currentSum<0){
                currentSum = 0;
            }
        }
        return maxSum;

    }
}
