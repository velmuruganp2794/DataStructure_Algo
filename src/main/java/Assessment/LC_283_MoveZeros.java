package Assessment;

public class LC_283_MoveZeros {
    /*
      1. Use two pointers left=0, right = 1
      2. loop till left<right
      3. if left pointer value is zero and right pointer value is not zero, swap the numbers and decrement right pointer
      4. if left pointer is not zero , increment left
      5. if right pointer is zero or left==right, increment right.
      */
    /* Time Complexity = O(N), Space complexity = O(1) */
    public void moveZeroes(int[] nums) {
        int left=0, right=1;

        while(left<nums.length && right<nums.length){

            if(nums[left]==0 && nums[right]!=0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

            }
            if(nums[right]==0 || right==left) right++;
            if(nums[left]!=0) left++;

        }



    }
}
