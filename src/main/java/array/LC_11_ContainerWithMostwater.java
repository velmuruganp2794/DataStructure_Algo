package array;

import org.junit.Test;

public class LC_11_ContainerWithMostwater {

    /* Pseudo-code
    1. Use two pointer, left=0, right=end-1
    2. Find the minimum of left and right pointer values
    3. Calculate maximum water contains between these two points by right-left * Minimu of (left, right)
    5. set it as maximum. increase the pointer, if left is minimum. else decrease the pointer
    6. return maxcount.
     */

    @Test
    public void testdata1(){
        int height[] ={1,8,6,2,5,4,8,3,7};
        int out = maxArea(height);
        System.out.println(out);
    }

    @Test
    public void testdata2(){
        int height[] ={1,1};
        int out = maxArea(height);
        System.out.println(out);
    }

    public int maxArea(int[] height) {
        int left=0, right=height.length-1, maxCount=0;

        while(left<right){

           if(height[left]<height[right]){
               maxCount = Math.max(maxCount,(right-left)*height[left]);
               left++;
           } else {
               maxCount = Math.max(maxCount,(right-left)*height[right]);
               right--;
           }

        }

        return maxCount;
    }
}
