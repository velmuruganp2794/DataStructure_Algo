package twopointer;

import java.util.Arrays;

import array.sortArrayByParity;

public class SortByParity {

	public static void main(String[] args) {
		SortByParity obj = new SortByParity();		
		System.out.println(Arrays.toString(obj.sortArrayByParity_usingTwoPointer(new int[] {2,3,2,4,7})));

	}
	
	public int[] sortArrayByParity_usingTwoPointer(int[] input) {
        int i = 0, j = input.length - 1;
        while (i < j) {
            if (input[i] % 2 > input[j] % 2) {
                int tmp = input[i];
                input[i] = input[j];
                input[j] = tmp;
               
            }

            if (input[i] % 2 == 0) i++;
            if (input[j] % 2 == 1) j--;
        }

        return input;
    }
	

}
