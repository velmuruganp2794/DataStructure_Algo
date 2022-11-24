package twopointer;

import org.junit.Test;

import java.util.Arrays;

public class LC_977_SquaresOfSortedArray {
    /*Pseudo-code
    1. Declare output array with same input size
    2. use two pointer, left =0, right = length-1
    3. compare both square of left and right index of element
    4. put the largest one in the end of output array
    5. if left side is greater, increase left pointer
    6. else decrease right pointer
    7. do the same till left<right

     */

    /* Time Complexity = O(N), Space Complexity = O(N) */

    @Test
    public void testdata1(){

      int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
      //  Output: [0,1,9,16,100]
      /*  Explanation: After squaring, the array becomes [16,1,0,9,100].
        After sorting, it becomes [0,1,9,16,100].*/

    }

    public int[] sortedSquares(int[] nums) {

        int left=0, right=nums.length-1;
        int[] output = new int[nums.length];
        int length=nums.length-1;
        while(left<=right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare<rightSquare){
                output[length]= rightSquare;
                right--;
                length--;
            } else {
                output[length] = leftSquare;
                left++;
                length--;
            }

        }
return output;

    }
}
