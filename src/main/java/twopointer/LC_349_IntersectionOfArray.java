package twopointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LC_349_IntersectionOfArray {

	public static void main(String[] args) {
		LC_349_IntersectionOfArray obj = new LC_349_IntersectionOfArray();
		int[] intersection = obj.intersection_Optimized(new int[] {3,2,2,3}, new int[]{2,2});
		System.out.println(Arrays.toString(intersection));

	}
	
	public int[] intersection_BruteForce(int[] nums1, int[] nums2) {
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

    public int[] intersection_Optimized(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<Integer> set = new HashSet<>();
        int m=0,n=0;
        while(m< nums1.length && n< nums2.length){
            if(nums1[m]==nums2[n]) {
                set.add(nums1[m]);
                m++;n++;
            }
            else if (nums1[m]<nums2[n]){
                m++;
            }
            else{
                n++;
            }
        }
        int[] output = new int[set.size()];
        int j=0;
        for (int i:set) {
            output[j++]=i;
        }
        return output;

    }

}
