package bruteForce;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

public class LC_202_HappyNumber {

    /* Pseudo code
    1. find square of each digit and add it
    2. add the sumofdigits to hashset if not exist
    3. if exist return false
    4. if sum of digit is 1, return true;


     */

    @Test
    public void testdata1(){
        int n=2;
        System.out.println(isHappy_bruteForce(n));
    }

    @Test
    public void testdata2(){
        int n=9;
        System.out.println(isHappy_bruteForce(n));
    }

    @Test
    public void testdata3(){
        int n=19;
        System.out.println(isHappy_bruteForce(n));
    }

    public boolean isHappy_bruteForce(int n) {

        int sumOfDigits=0;
        HashSet<Integer> set = new HashSet<>();

        while(n>0) {
            int digit = n % 10;
            sumOfDigits += Math.pow(digit, 2);
            n = n / 10;
            if (n == 0) {
                if(sumOfDigits==1) return true;
                n = sumOfDigits;
                if(set.contains(n)) break;
                else set.add(n);
                sumOfDigits = 0;
            }

        }


          return false;

        }

    public boolean isHappy_optimized(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n = nextInt(n);
        }
        return n==1;
    }

    public int nextInt(int n){
        int sumOfDigit=0;
        while(n > 0){
            int digit = n%10;
            n = n/10;
            sumOfDigit += digit * digit;

        }
        return sumOfDigit;
    }

}

