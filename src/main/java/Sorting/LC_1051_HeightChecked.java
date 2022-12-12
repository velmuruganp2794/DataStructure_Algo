package Sorting;

import org.junit.Test;

public class LC_1051_HeightChecked {

    /* Pseudo-Code
    1. Sort the Array using sorting technique and compare both the array values at each index position
    2. if not matches increase the count value.
    3. return count.
     */

    /*Time Complexity = O(n^2), Space Complexity - O(n) */

    @Test
    public void testdata1(){
        int[] input = new int[]{1,1,4,2,1,3};
        int out = heightChecker(input);
        System.out.println(out);
    }

    @Test
    public void testdata2(){
        int[] input = new int[]{5,1,2,3,4};
        int out = heightChecker(input);
        System.out.println(out);
    }

    @Test
    public void testdata3(){
        int[] input = new int[]{1,2,3,4,5};
        int out = heightChecker(input);
        System.out.println(out);
    }

    public int heightChecker(int[] heights) {

        int[] original = new int[heights.length];
        int count =0;
        System.arraycopy(heights,0,original,0,heights.length);
        for (int i=0;i<heights.length-1;i++){
            int small = i;

            for(int j=i+1;j<heights.length;j++){
                if(heights[small]>heights[j]) small = j;
            }
            int temp = heights[i];
            heights[i] = heights[small];
            heights[small]= temp;
        }


        for(int i=0;i<heights.length;i++){

            if(heights[i]!=original[i]) count++;
        }
       return count;
    }
    public int heightChecker_Optimized(int[] heights) {
        int[] bucket = new int[101];

        for (int i : heights)
            bucket[i]++;

        int ans = 0, currHeight = 0;

        for (int i = 0; i < heights.length; ++i) {
            while (bucket[currHeight] == 0)
                ++currHeight;

            if (currHeight != heights[i]) {
                ++ans;
            }

            bucket[currHeight]--;
        }

        return ans;
    }
}
