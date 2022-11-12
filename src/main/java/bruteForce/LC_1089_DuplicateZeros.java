package bruteForce;

import org.junit.Test;

public class LC_1089_DuplicateZeros {

    /* Pseudo code
    1. Count number of zeros in array
    2. two pointer j=length-1, i=length+zeroCount-1
    3. traverse loop with j, i and j<i , decrement j , i;
    4. if arr[j]!=0, check i less than arr length
    5. copy arr[j] to i th position.
    6. if arr[j]==0, copy to ith position and decrement i and copy same jth value to ith position.
     */

    @Test
    public void testdata1(){
          int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);

    }

    @Test
    public void testdata2(){
        int[] arr = {1,2,3};
        duplicateZeros(arr);

    }

    @Test
    public void testdata3(){
        int[] arr = {8,5,0,9,0,3,4,7};
        duplicateZeros(arr);

    }

    public void duplicateZeros(int[] nums) {


        int countZero = 0;
        for (int num : nums) if (num == 0) countZero++;

        int len = nums.length + countZero;
        for (int j = nums.length - 1, i = len - 1; j < i; j--, i--) {
            if (nums[j] != 0) {
                if (i < nums.length) nums[i] = nums[j];

            } else {
                if (i < nums.length) nums[i] = nums[j];
                i--;
                if (i < nums.length) nums[i] = nums[j]; //copy twice when hit '0'
            }
        }


    }
}
