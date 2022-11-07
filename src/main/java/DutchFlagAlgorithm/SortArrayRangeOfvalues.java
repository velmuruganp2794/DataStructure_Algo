package DutchFlagAlgorithm;

import org.junit.Test;

import java.util.Arrays;

public class SortArrayRangeOfvalues {
    /*
    For example, you might be give the array [5,7,2,9,1,14,12,10,5,3].
For input integers 1 - 3, getCategory(integer) returns "low", for 4 - 10 it returns "medium," and for 11 - 15 it returns "high".
     */

    @Test
    public void testdata1(){

        int[] nums = {5,7,2,9,1,14,12,10,5,3};
        int[] outputArray = sortOrder(nums);
        System.out.println(Arrays.toString(outputArray));

    }

    public int[] sortOrder(int[] nums){

       //  2, 3 , 4, 6 // 6 4 3 2
        int lowP=0, middleP=0, highP=nums.length-1;

        while(middleP<=highP){

            if(getCategory(nums[middleP] ).equals("low")){
                int temp = nums[middleP];
                nums[middleP] =  nums[lowP];
                nums[lowP] = temp;
                lowP++;
                middleP++;

            } else if (getCategory(nums[middleP] ).equals("medium")){
                middleP++;
            } else {
                int temp = nums[middleP];
                nums[middleP] =  nums[highP];
                nums[highP] = temp;
                highP--;

            }

        }
        return nums;
    }

    public String getCategory(int n){


        if(n <= 3 ){
          return "low";
        } else if (n <=10 && n >= 4){
          return "medium";
        } else {
          return "high";
        }
    }
}
