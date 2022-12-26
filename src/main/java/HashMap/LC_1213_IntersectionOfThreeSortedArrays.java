package HashMap;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

public class LC_1213_IntersectionOfThreeSortedArrays {

    /* Pseudo-code
    1. Traverse elements in array1 and add it to set1
    2. Traverse array2 and add it to set2, if array2 elements contains in set1
    3. Traverse array3 and add it to set3, if array3 elements contains in set2
    4. return set3 as array
     */

    @Test
    public void testdata(){
        int[] arr1=new int[] {1,2,3,4,5};
        int[] arr2=new int[] {1,2,5,7,9};
        int[] arr3=new int[] {1,3,4,5,8};
        int[] out = intersection_Optimized(arr1, arr2, arr3);
        System.out.println(Arrays.toString(out));
    }

    public int[] intersection_Optimized(int[] nums1, int[] nums2, int[] nums3) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        // Add all the elements to set1
        for (int num1:nums1) set1.add(num1);

        // Traverse elements in array2 and check in set1. if contains add into set2.
        for(int num2:nums2){
            if(set1.contains(num2)) set2.add(num2);
        }

        for(int num3:nums3){
            if(set2.contains(num3)) set3.add(num3);
        }
        int i=0;
        int[] output = new int[set3.size()];
        for (int num:set3) output[i++] = num;

        return output;

    }

}
