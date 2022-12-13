package BinarySearch;

public class LC_1539_KthMissingPositiveNumber {

    /*Pseudo-code
    1. Find the mid point of the array
    2. find the number of element missing by arr[mid]-mid-1 ie. -1 is for number starts at 1st index
    3. If number of element missing is less than k, set left = mid+1
    4. else set right = mid-1
    5. do the same till left<=right
    6. return left+k

     */

    /*Time Complexity = O(log N), Space Complexity = O(1) */

    public int findKthPositive(int[] arr, int k) {

        int left=0,right=arr.length-1,mid=0;
        while(left<=right){
            mid = (right+left)/2;
            if(arr[mid] - mid-1 < k) left = mid+1;
            else right = mid-1;
        }
        System.out.println(left+" "+right);

        return left+k;

    }

}
