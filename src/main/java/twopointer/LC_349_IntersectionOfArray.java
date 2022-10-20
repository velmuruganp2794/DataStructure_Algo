package twopointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LC_349_IntersectionOfArray {

	public static void main(String[] args) {
		LC_349_IntersectionOfArray obj = new LC_349_IntersectionOfArray();
		int[] intersection = obj.intersection(new int[] {3,2,2,3}, new int[]{2,2});
		System.out.println(Arrays.toString(intersection));

	}
	
	public int[] intersection(int[] nums1, int[] nums2) {
        int i=0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        
       Set<Integer> set = new HashSet<Integer>();

       while(i < len1 ){
           int j=0;
           while(j<len2) {
         
         if(nums1[i]!=nums2[j]) {
             j++;
         } else {
             set.add(nums1[i]);
             break;
         }
        

           }
            i++;
       }
       int output[] = new int[set.size()];
       int k=0;
       for(int setItems:set) {
        output[k++]=setItems;
       }
       return output;

    }

}
