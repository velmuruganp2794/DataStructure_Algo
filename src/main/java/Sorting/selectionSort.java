package Sorting;

import org.junit.Test;

import java.util.Arrays;

public class selectionSort {
    /*Pseudo-code:
    1. Select 0th index of element as minimum
    2. outer loop traverse till length-1
    3. inner loop from i+1 to length
    4. find the smallest index and swap it with ith minimum
    5. do the same
    6. return output array.
     */
    /* Time Complexity = O(n^2), Space Completed = O(n) */

    @Test
    public void testdata1(){
        int[] arr = new int[] {5,1,3,2,4,6};
        int[] output = selectionArray(arr);
        System.out.println(Arrays.toString(output));
        int[] output1 = selectionArray_Des(arr);
        System.out.println(Arrays.toString(output1));
    }

    @Test
    public void testdata2(){
        int[] arr = new int[] {3,1,1,2,4};
        int[] output = selectionArray(arr);
        System.out.println(Arrays.toString(output));
    }

    public int[] selectionArray(int[] num){

        for (int i=0;i<num.length-1;i++){
            int small = i;

            for(int j=i+1;j<num.length;j++){
                if(num[small]>num[j]) small = j;
            }
            int temp = num[i];
            num[i] = num[small];
            num[small]= temp;
        }

        return num;

    }

    public int[] selectionArray_Des(int[] num){

        for (int i=0;i<num.length-1;i++){
            int max = i;

            for(int j=i+1;j<num.length;j++){
                if(num[max]<num[j]) max = j;
            }
            int temp = num[i];
            num[i] = num[max];
            num[max]= temp;
        }

        return num;

    }
}
