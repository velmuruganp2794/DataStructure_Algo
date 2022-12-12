package BinarySearch;

import java.util.Arrays;

public class LC_268_MissingNumber {
    /* Pseudo-code
    1. Sort the Array
    2. loop till n, check the incremented
     */
    public int missingNumber_BruteForce(int[] nums) {

        Arrays.sort(nums);
        if(nums[nums.length-1]<nums.length) return nums.length;
        int startNum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=startNum) return startNum;
            startNum++;
        }
        return 0;
    }
}
