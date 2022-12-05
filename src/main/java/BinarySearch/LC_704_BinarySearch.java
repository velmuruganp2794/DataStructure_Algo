package BinarySearch;

import org.junit.Test;

public class LC_704_BinarySearch {

    // Start time = 9.57AM, End time =10.00 AM

    /* Pseudo-code
    1. let left=0, right=array length -1;
    2. Find the mid index
    3. check the mid index value is less than target, left = mid+1;
    4. if greater than target, right = right-1;
    5. else return mid.
    6. repeat until left less than or equal right
    7. at the end return -1.
     */
    /* Time Complexity = O(N), Space Complexity = O(1) */

    @Test
    public void testdata1(){
        int[] num = {-1,0,3,5,9,12};
        int target = 9;
        int out = search(num,target);
        System.out.println(out);
    }

    @Test
    public void testdata2(){
        int[] num = {-1,0,3,5,9,12};
        int target = 0;
        int out = search(num,target);
        System.out.println(out);
    }

    @Test
    public void testdata3(){
        int[] num = {-1,0,3,5,9,12};
        int target = -10;
        int out = search(num,target);
        System.out.println(out);
    }
    @Test
    public void testdata4(){
        int[] num = {-10};
        int target = -10;
        int out = search(num,target);
        System.out.println(out);
    }

    public int search(int[] nums, int target) {

        int left = 0, right = nums.length-1;

        while(left<=right){
            int mid = (left + right) / 2;

            if(nums[mid]<target)
                left = mid+1;
            else if (nums[mid]>target)
                right = mid-1;
            else return mid;
        }
        return -1;

    }
}
