package SlidingWindow;

import org.junit.Test;

public class LC_1052_GrumpyBookstoreOwner {
    //10.30
    /*
    Pseudo-code: BruteForce
    1. Traverse all the elements and find the satisfied customers in customer array
    2. traverse all the elements find the maximum not Satisfied customers in given window as minutes
    3. Add the maximum not satisfied count to  satisfied customers.
    4. return the value.
     */
    /* Time Complexity = O(n), Space Complexity = O(n) */

    @Test
    public void testdata1(){
        int[] customers = {1,0,1,2,1,1,7,5}, grumpy = {0,1,0,1,0,1,0,1};
        int minutes = 3;
        //output = 16;
        int output = maxSatisfied_Bruteforce(customers,grumpy,minutes);
        System.out.println(output);

    }

    @Test
    public void testdata2(){
        int[] customers = {1}, grumpy = {0};
        int minutes = 1;
        //output = 1;
        int output = maxSatisfied_Bruteforce(customers,grumpy,minutes);
        System.out.println(output);

    }

    public int maxSatisfied_Bruteforce(int[] customers, int[] grumpy, int minutes) {
        int satisfiedCount=0, notSatisfiedCount=0, maxNotSatisfied=0;
        int start=0,end=0;

        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0) satisfiedCount +=customers[i];
        }

        while(end<minutes){
            if(grumpy[end]==1) notSatisfiedCount +=customers[end];
            end++;
        }
        maxNotSatisfied = notSatisfiedCount;

        while(end<customers.length){

            if(grumpy[end]==1) notSatisfiedCount += customers[end];
            if(grumpy[start]==1) notSatisfiedCount -= customers[start];
            maxNotSatisfied = Math.max(maxNotSatisfied,notSatisfiedCount);
            end++;
            start++;

        }

        return satisfiedCount+maxNotSatisfied;

    }


}
