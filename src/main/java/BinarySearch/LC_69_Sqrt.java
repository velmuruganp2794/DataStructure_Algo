package BinarySearch;

import org.junit.Test;

public class LC_69_Sqrt {

    // Start time = 11.51

    @Test
    public void testdata1(){
        int x = 2147395599;
        int output = mySqrt(x);
        System.out.println(output);
    }

    public int mySqrt(int x) {

        long left = 1, right = x/2;

        while(left<=right){
            long mid = (left + right) / 2;

            if(mid * mid<x ) {
                left = mid+1;
            } else if (mid*mid>x)
                right = mid-1;
            else return (int) mid;
        }

        return (int) left-1;

    }
}
