package twopointer;

import org.junit.Test;

public class LC_26_RemoveDuplicatesfromArray {

    /* Pseudo-code
    1. let start=0, end=1
    2. tarverse array, check for unique elements
    3. if number is duplicate increment end
    4. if number is unique, assign the number to start+1 position. increment start, end
    5. do the same till end less than length
    6. return start+1;
     */

    @Test
    public void testdata1(){
        int[] nums={1,1,2};
        int output = removeDuplicates(nums);
        System.out.println(output);
    }

    @Test
    public void testdata2(){
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int output = removeDuplicates(nums);
        System.out.println(output);
    }

    public int removeDuplicates(int[] nums) {

        int left=0, right=1;

        while(right<nums.length){

            if(nums[left]!=nums[right]){
                nums[left+1]=nums[right];
                left++;
                right++;
            } else {
                right++;
            }

        }
        return left+1;

    }
}
