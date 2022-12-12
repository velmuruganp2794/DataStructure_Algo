package array;

import org.junit.Test;

public class FindIndexOfnumberInArray {

    /*
    1. traverse each element in array and compare with target.
    2. if matches , print index
    3. else -1;
     */

    @Test
    public void testdata1(){
        int[] num = {-1,0,3,5,9,12};
        int target = -13;
        int out = findIndex(num,target);
        System.out.println(out);
    }

    public int findIndex(int[] num, int target){

        if(num[num.length-1]<target || num[0]>target) return -1;

       for(int i=0;i<num.length;i++){
           if(num[i]==target) return i;
       }
       return -1;
    }
}
