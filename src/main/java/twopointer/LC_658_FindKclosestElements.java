package twopointer;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LC_658_FindKclosestElements {

    /* Pseudo-code
    1. as per the condition provided
    An integer a is closer to x than an integer b if:

|a - x| < |b - x|, or
|a - x| == |b - x| and a < b

    2. use two pointer. start = 0, end = length-1
    3. find absolute value of start-x, end-x
    4. if start-x< end-x , decrement end
    5. else start ++
    6. do the same till end-start>=k
    7. outside the loop, add the start to end element to list

     */

    /* time complexity = O(N), Space Complexity = O(N) */

    @Test
    public void testdata(){

        int arr[] = new int[] {1,2,3,4,5};
        int k=4;
        int x = 3;
        List<Integer> closestElements = findClosestElements(arr, k, x);
        System.out.println(closestElements);
    }


    @Test
    public void testdata1(){

        int arr[] = new int[] {1,2,3,4,5};
        int k=4;
        int x = -1;
        List<Integer> closestElements = findClosestElements(arr, k, x);
        System.out.println(closestElements);
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int start = 0, end = arr.length - 1;

        while (end - start >= k) {

            if (Math.abs(arr[start] - x) <= Math.abs(arr[end] - x)) end--;
            else start++;
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = start; i <=end;i++) {
            list.add(arr[i]);

        }
        return list;
    }

}