package array;

import org.junit.Test;

public class LC_258_AddDigits {
    /*Pseudo-code

    1. Find the sum of digits
    2. if sum if less than 9, do the same
    3. return the number when the condition fails
     */

    @Test
    public void testdata1(){
        int n=38;
        int output = addDigits(n);
        System.out.println(output);
    }

    public int addDigits(int num) {

        while (num > 9) {

             num = nextInt(num);

        }

        return num;
    }

        public int nextInt(int num1){
        int sum=0;
        while(num1>0){
            int digit = num1%10;
            sum +=digit;
            num1 /= 10;

        }
            return sum;
        }
}