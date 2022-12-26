package array;

import org.junit.Test;

import java.util.Arrays;

public class mergeSort_test {

    @Test
    public void td1(){
        int[] input = new int[]{5,6,3,1,7,2,4};
        mergeSort(input,0,input.length-1);
        System.out.println(Arrays.toString(input));
    }
    @Test
    public void td2(){
        int[] input = new int[]{5,6,3,1,7,2,4,0};
        mergeSort(input,0,input.length-1);
        System.out.println(Arrays.toString(input));
    }

    @Test
    public void td3(){
        int[] input = new int[]{5,6,3,1,7};
        mergeSort(input,0,input.length-1);
        System.out.println(Arrays.toString(input));
    }
    
    public void mergeSort(int[] input, int start, int end){
        
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(input,start,mid);
            mergeSort(input,mid+1,end);
            merge(input, start,mid,end);
        }
        
    }

    private void merge(int[] input, int start, int mid, int end) {
        int[] temp = new int[end-start+1];
        int tempIndex=0, left=start, right = mid+1;

        while(left<=mid && right<=end){

            if(input[left]<input[right]){
                temp[tempIndex++] = input[left++];
            } else {
                temp[tempIndex++] = input[right++];
            }

        }

        while(left<=mid){
            temp[tempIndex++] = input[left++];
        }
        while(right<=end){
            temp[tempIndex++] = input[right++];
        }

        for(int i=start;i<=end;i++){
            input[i] = temp[i-start];
        }
    }
}
