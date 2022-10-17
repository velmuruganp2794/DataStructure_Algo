package twopointer;

import java.util.Arrays;

public class moveZeros {

	public static void main(String[] args) {
		moveZeros obj = new moveZeros();
		int[] moveZeros = obj.moveZeroes(new int[]{0,1,0,3,12});
		System.out.println(Arrays.toString(moveZeros));

	}
	
public int[] moveZeroes(int[] nums) {
        
        int start=0, end=1;
       
        while(start < nums.length && end < nums.length){
           //System.out.println("Start"+start+", End "+end);
           if(nums[start] < nums[end] && nums[start]==0){
               
                 int temp = nums[start];
                 nums[start] = nums[end];
                 nums[end] = temp;

           }
            
           if(nums[start]!=0) start++;
           if(nums[end]==0) end++;
           if(start==end) end++;


        }
		return nums;
        
    }

}
