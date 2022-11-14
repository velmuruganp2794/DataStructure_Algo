package bruteForce;

import org.junit.Test;

import java.util.Arrays;

public class LC_66_PlusOne {

    /* Pseudo code
   1. Traverse array elements from last, check last element is other than 9
   2. if yes, add one to last element in array and return array
   3. else replace the array value as zero
   4. finally create new array with size+1
   5. put 1 as in the first element;
   */
    /*Time Complexity = O(N), Space Complexity = O(1) */

    @Test
    public void testdata1(){
        int[] digits = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
       // Output: [1,2,4]

    }

    @Test
    public void testdata2(){
        int[] digits = {9};
        System.out.println(Arrays.toString(plusOne(digits)));
        // Output: [1,0]

    }
    public int[] plusOne(int[] digits) {
        int length = digits.length;

        for(int i=length-1;i>=0;i--){
            if(digits[i] !=9){
                digits[i] = digits[i]+1;
                return digits;
            }
            digits[i]=0;
        }
        int[] newDigits = new int[length+1];
        newDigits[0]=1;
        return newDigits;



    }
}
