package array;

import org.junit.Test;

public class LC_42_trappingRainwater {
    /*
    Pseudo-code
    1. Find the left maximum of each element in the array and store it in the separate array
    2. Find the right maximum of each element in the array and store it in the separate array
    3. Ignore 0th and last position, since water wont trap on those places
    4. Find the minimum of left and right maximum and minus with respective index value
    5. count the same for all the index and return as trapping water count.
     */

    /*Time Complexity = O(N) , Space Complexity = O(N) */

    @Test
    public void testdata1(){

       int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int count = trap(height);
        System.out.println(count);
    }

    @Test
    public void testdata2(){

        int[] height = {4,2,0,3,2,5};
        int count = trap(height);
        System.out.println(count);
    }



    public int trap(int[] height) {

        int trappingWater=0;

        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }


        for(int i=1;i<height.length-1;i++){
            trappingWater = trappingWater+(Math.min(leftMax[i],rightMax[i]) - height[i]);
        }

        return trappingWater;

    }
}
