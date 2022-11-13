package SlidingWindow;

import org.junit.Test;

public class LC_1248_k_Odd_Numbers {

     /* Pseudo code:
    1. calculate atMost K odd number subArrays and k-1 odd number sub arrays
    2. exact k number of subArrays = k atMost subArrays - k-1 atmost subArrays
    3. use two pointer i=0,j=0, count=0
    4. Traverse nums array till j< nums.length
    5. if nums of j is odd, decrement k value
    6. if k is less than 0, then check ith position is odd, if odd increate i and k value by one
    7. find the number of permutation based on j and i length (ie) j-i+1
    8. add number of permutation to count.
    9. return count. similarly for k-1 find the count
    10. return k count - (k-1) count;
    */

    @Test
    public void positive(){

        int[] nums = {1,1,2,1,1};
        int k = 3;
        numberOfSubarrays(nums,k);
        //output = 2;

    }

    @Test
    public void negative(){

        int[] nums = {2,4,6};
        int k = 3;
        numberOfSubarrays(nums,k);
        //output = 0;

    }

    @Test
    public void edge(){

        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        numberOfSubarrays(nums,k);
        //output = 14;

    }

    public int numberOfSubarrays(int[] A, int k) {
        int k1 = atMost(A, k);
        int k2 = atMost(A, k - 1);
        return  k1 - k2 ;
    }

    public int atMost(int[] A, int k) {
        int count = 0, i = 0, n = A.length;
        for (int j = 0; j < n; j++) {
            k = k - A[j] % 2;
            while (k < 0)
                k = k + A[i++] % 2;
            count += j - i + 1;
        }
        return count;
    }
}
