package twopointer;

import java.util.Arrays;

import org.junit.Test;

public class LC_88_MergeSortedArray {

	/*
	 * 1. Problem Given two integer sorted array - non decreasing order. two
	 * integer m, n representing number of elements in nums1, nums2 array
	 * #######
	 * 
	 * 2. Test data:
	 * 
	 * Positive## nums1 = [1,2,3,0,0,0] , nums2 = [2,5,6], m=3, n=3; output =
	 * [1,2,2,3,5,6]
	 * 
	 * Negative## nums1= [0] , nums2 = [] => m=0, n=0; output = []
	 * 
	 * Edge### nums1[2,2,0,0], nums2[1,1] , m=2`, n=2; Output = [1,1,2,2]
	 * 
	 * ## nums1[1], nums2[], m=1,n=0;
	 * 
	 * 
	 * ########Psuedo Code###########:
	 * 
	 * 1. Check if m is zero. return nums2 2. Start = m, end =n 3. Traverse
	 * elements using start and end 4. compare nums1[m]<nums2[n], if yes, add
	 * nums2[n] to nums1[m+n-1] place and decrement end 5. Else add nums1[m] to
	 * nums1[m+n-1] place and decrement start 6. loop this till m>0 && n>0 7.
	 * Return nums1 array. 8. Check any remaining elements in nums2, if yes add
	 * the elements in nums1.
	 *
	 * ######Time Complexity######## O(m+n)+O(n) ==> O(m+n)
	 * 
	 * ######Space Complexity####### O(1)
	 */

	@Test
	public void positive() {

	}

	@Test
	public void negative() {

	}

	@Test
	public void edge() {

	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {

		// Time complexity = O(m+n)
		if (m == 0)
			System.arraycopy(nums2, 0, nums1, 0, nums1.length);
		else {
			while (m > 0 && n > 0) {

				if (nums1[m - 1] < nums2[n - 1]) {
					nums1[m + n - 1] = nums2[n - 1];
					n--;
				} else {
					nums1[m + n - 1] = nums1[m - 1];
					m--;
				}

			}

			while (n > 0) {
				nums1[m + n - 1] = nums2[n - 1];
				n--;
			}

			Arrays.toString(nums1);
		}
	}

}
