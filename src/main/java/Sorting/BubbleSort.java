package Sorting;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSort {
    /* Pseudo-Code
    1. compare j, j+1 in inner loop
    2. Swap if j is greater than j+1
    3. do the same in inner loop. so that maximum can be moved to right side
     */
    /* Time Complexity = O(N^2), Space Complexity = O(N) */

    @Test
    public void testdata1(){
        int[] arr = new int[] {5,2,3,1,4,6};
        int[] output = bubbleSort(arr);
        System.out.println(Arrays.toString(output));

    }

    @Test
    public void testdata2(){
        int[] arr = new int[] {3,1,1,2,4};
        int[] output = bubbleSort(arr);
        System.out.println(Arrays.toString(output));
    }

    public int[] bubbleSort(int[] num){

        for(int i=0;i<num.length;i++){

            for(int j=0;j<num.length-i-1;j++){

                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }

            }
        }
         return num;
    }
}
