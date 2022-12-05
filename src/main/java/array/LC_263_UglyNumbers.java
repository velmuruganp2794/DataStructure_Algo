package array;

public class LC_263_UglyNumbers {

    /*Pseudo-code
    1. Check the number can be mod divided by 2, 3, 5 and get reminder 0.
    2. if yes, re-initialize the number /2, number/3, number/5
    3. at last if number is equal to 1, return true. Else return false.
     */

    /*Time Complexity = O(N), Space Complexity = O(1) */

    public boolean isUgly(int n) {

        while(n%2==0) n /= 2;
        while(n%3==0) n /= 3;
        while(n%5==0) n /= 5;

        return n==1;
    }

    public boolean isUgly_(int n) {

        while(n>1){

            if(n%2==0) n/=2;
            else if (n%3==0) n /=3;
            else if (n%5==0) n /=5;
            else return false;


        }

        return n==1;

    }

}
