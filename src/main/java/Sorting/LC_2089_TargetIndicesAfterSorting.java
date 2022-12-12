package Sorting;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_2089_TargetIndicesAfterSorting {
    /* Pseudo-code
    1. Sort the array
    2. Traverse the array
    */

    @Test
    public void testdata(){

        int[] nums = {1,2,5,2,3};
        int target = 2;
        List<Integer> out = targetIndices(nums, target);
        System.out.println(out);
    }

    public List<Integer> targetIndices(int[] nums, int target) {


        ArrayList<Integer> out = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] > target) break;
            if(nums[i]==target) out.add(i);
        }

        return out;

    }

    public List<Integer> targetIndices_Optimized(int[] nums, int target) {

        int lowerNumberCounter = 0, targetNumberCounter = 0;

        for( int each : nums){
            if(each < target) lowerNumberCounter++;
            else if(each == target) targetNumberCounter++;
        }

        ArrayList<Integer> output = new ArrayList<>(targetNumberCounter);
        for(int i =0 ; i <targetNumberCounter; i++){
            output.add(lowerNumberCounter+i);
        }
        return output;

    }
}
