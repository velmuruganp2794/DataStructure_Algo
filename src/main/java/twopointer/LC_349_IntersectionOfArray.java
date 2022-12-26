package twopointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.copyOf;

public class LC_349_IntersectionOfArray {

    /* Pseudo-code
    1. Sort the both the arrays
    2. Use two pointer m, n to compare both the array from starting pointer
    3. if both the number are equal, add it to set and increase both the pointer
    4. if m pointer value less than n pointer, increase m pointer. else n pointer
    5. return set as int array
     */

    /* Time-Complexity = O(NlogN), Space complexity = O(N)
     */

	public static void main(String[] args) {
		LC_349_IntersectionOfArray obj = new LC_349_IntersectionOfArray();
		int[] intersection = obj.intersection_Optimized(new int[] {3,2,2,3}, new int[]{2,2});
		System.out.println(Arrays.toString(intersection));

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

    /* Time Complexity = O(N+M), Space Complexity = O(N) */
    public int[] intersection_TwoSet(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num1:nums1) set1.add(num1);
        for(int num2:nums2) set2.add(num2);

        int[] output = new int[set1.size()];
        int i=0;

        for(int number1:set1){
            if(set2.contains(number1))  output[i++] = number1;
        }

        return Arrays.copyOf(output,i);
    }

    public int[] intersection_BinarySearch(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        HashSet<Integer> set = new HashSet<>();

        for(int nums:nums2){
             if(binarySearch(nums1,nums)) set.add(nums);
        }
        int[] output = new int[set.size()];
        int i=0;
        for(int num:set) output[i++] = num;
        return output;

    }

    public boolean binarySearch(int[] nums, int target){
        int start=0, mid=0, end = nums.length;
        while(start<=end){
            mid = (start+end)/2;

            if(nums[mid]==target) return true;
            else if (nums[mid]<target) start = mid+1;
            else end = mid-1;

        }
        return false;
    }


}

