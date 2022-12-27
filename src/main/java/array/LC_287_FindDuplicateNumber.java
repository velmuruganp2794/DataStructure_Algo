package array;

import org.junit.Test;

public class LC_287_FindDuplicateNumber {
    // Array will contains 1 to N element. Size will be N+1

    /*
    Pseudo-code
    1. check if nums[0], nums[nums[0]] equal, return nums[0] as duplicate.
    2. Since Array contain only one duplicate
    3. Else swap the number in 0th index to value of index. in value in the value-Th index to 0th index.
    4. loop the same process. when condition satisfies, return oth index value.

     */

    /* Time Complexity = O(N), Space Complexity = O(1) */

    @Test
    public void testdata1(){
      int[] nums = new int[] {1,3,4,2,2};
        int duplicate = findDuplicate(nums);
        System.out.println(duplicate);

    }

    @Test
    public void testdata2(){
        int[] nums = new int[] {3,1,3,4,2};
        int duplicate = findDuplicate(nums);
        System.out.println(duplicate);

    }

    public int findDuplicate(int[] nums) {

        while(nums[0]!=nums[nums[0]]){

            int temp = nums[0];
            nums[0] = nums[nums[0]];
            nums[temp] = temp;
        }
       return nums[0];
    }
}
