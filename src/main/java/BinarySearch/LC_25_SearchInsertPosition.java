package BinarySearch;

import org.junit.Test;

import java.util.Arrays;

public class LC_25_SearchInsertPosition {
    /*Pseuo-code
    1. let int left = 0, right = length -1
    2. Find the mid index
    3. check the mid index value is less than target, left = mid+1;
    4. if greater than target, right = right-1;
    5. else return mid.
    6. repeat until left less than or equal right
    7. at the end return left;
     */

    //Start Time =10.15, End time =10.21.

    /*Time Complexity = O(log N), space complexity = O(1) */

    @Test
    public void testdata1(){
        int[] num = {-1,0,3,5,9,12};
        int target = 9;
        int out = searchInsert(num,target);
        System.out.println(out);
    }

    @Test
    public void testdata2(){
        int[] num = {1,3,5,6};
        int target = 2;
        int out = searchInsert(num,target);
        System.out.println(out);
    }

    @Test
    public void testdata3(){
        int[] num = {1,3,5,6};
        int target = 7;
        int out = searchInsert(num,target);
        System.out.println(out);
    }

    public int searchInsert(int[] nums, int target) {

        int left = 0, right = nums.length-1;

        while(left<=right){
            int mid = (left + right) / 2;

            if(nums[mid]<target)
                left = mid+1;
            else if (nums[mid]>target)
                right = mid-1;
            else return mid;
        }
        return left;

    }


}
