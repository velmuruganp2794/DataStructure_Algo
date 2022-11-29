package Assessment;

import org.junit.Test;

public class LC_MaximumAverageSubArray {

    /*Pseudo-code
    1. declare MaxAvg variable as Integer minimum value
    2. find the sum of first k elements
    3. find the avg and store it in double variable
    4. consider that as current MaxAvg
    5. then traverse from k element in array,add one elment right to sum, and minum start element from sum
    6. find the avg and compare it with existing avg
    7. assign maximum value to MaxAvg
    8. do the same till last window
    9. return maxAvg
     */

    /*Time Complexity = O(N), Space Complexity = O(1) */

    @Test
    public void testdata1(){
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double output = findMaxAverage(nums,k);
        System.out.println(output);

    }

    @Test
    public void testdata2(){
        int[] nums = {5};
        int k = 1;
        double output = findMaxAverage(nums,k);
        System.out.println(output);
    }

    public double findMaxAverage(int[] nums, int k) {

        double sum=0;
        double maxAvg=0;
        int start=0;

        for(int i=0;i<k;i++){
            sum = sum+nums[i];
        }
        maxAvg = sum/k;

        for(int j=k;j<nums.length;j++){
            sum = sum+nums[j]-nums[start];
            start++;
            maxAvg = Math.max(maxAvg, sum/k);

        }
        return  maxAvg;

    }
}
