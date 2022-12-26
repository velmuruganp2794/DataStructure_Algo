package Sorting;

import org.junit.Test;

import java.util.Arrays;

public class mergeSort {
    /*Pseudo-code
    1. Spilt the array into two subarrays using mid point
    2. do the same till each subArray have one element
    3. merge the sub array with sorting order
    4. return the array
     */

    /*Time Complexity = O(NlogN), Space Complexity = O(N) */

    @Test
    public void td1(){
        int[] input = new int[]{5,6,3,1,7,2,4};
        mergesort(input);
        System.out.println(Arrays.toString(input));
    }
    @Test
    public void td2(){
        int[] input = new int[]{5,6,3,1,7,2,4,0};
        mergesort(input);
        System.out.println(Arrays.toString(input));
    }

    @Test
    public void td3(){
        int[] input = new int[]{5,6,3,1,7};
        mergesort(input);
        System.out.println(Arrays.toString(input));
    }


    public void mergesort(int[] input){
        sortArray(input,0,input.length-1);
    }

    public void sortArray(int[] input, int start,int end){

        if(start<end){
            int mid = (start+end)/2;

            sortArray(input,start,mid);
            sortArray(input,mid+1,end);
            merge(input,start,mid,end);
        }

    }


    public void merge(int[] input1,int start, int mid, int end){
        int[] temp = new int[end-start+1];
        int left = start, right=mid+1;
        int tempIndex =0;

        while(left<=mid && right<=end){

            if(input1[left]<input1[right]){
                temp[tempIndex++] = input1[left++];
            } else {
                temp[tempIndex++] = input1[right++];
            }


        }

        while(left<=mid){
            temp[tempIndex++]=input1[left++];
        }
        while(right<=end){
            temp[tempIndex++]=input1[right++];
        }

        for(int i=start;i<=end;i++){
            input1[i] = temp[i-start];
        }


    }
}
