package BinarySearch;

import org.junit.Test;

import java.util.Arrays;

public class LC_2389_LongestSubsequenceWithLimittedSum {

    /*
    1. Sort the given array
    2. use prefix sum and update the array with sum
    3. traverse each query, and binary search the position in the prefix sum array
    4. return math.abs value of binary search value and put it in the output array
     */

    /* Time Complexity = O(NlogN) + O(N) + O(MlogN), Space Complexity = O(n) */

    @Test
    public void testdata1() {
        int[] nums = new int[]{4, 5, 2, 1};
        int[] queries = new int[]{3, 10, 21};
        int[] out = answerQueries(nums, queries);
        System.out.println(Arrays.toString(out));
    }

    public int[] answerQueries(int[] nums, int[] queries) {

        Arrays.sort(nums); //O(NlogN)
        int[] res = new int[queries.length];
        //Prefix_Sum

       for(int i=1;i<nums.length;i++){ // O(N)
           nums[i] = nums[i]+nums[i-1];
       }

       for(int j=0;j<queries.length;j++){ // O(M logN)
           int out = Arrays.binarySearch(nums,queries[j]);
           res[j] = Math.abs(out+1);
       }

     return res;

    }
}
