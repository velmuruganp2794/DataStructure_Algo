package Sorting;

import org.junit.Test;

import java.util.Arrays;

public class Sorting {

    @Test
    public void testdata1(){
        int[] arr = new int[] {5,1,3,2,4};
        int[] output = sort_BruteForce(arr);
        System.out.println(Arrays.toString(output));
    }

    public int[] sort_BruteForce(int[] num){

        for(int i=0;i<num.length;i++){

            for(int j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                    int temp = num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }

        }
        return num;
    }
}
