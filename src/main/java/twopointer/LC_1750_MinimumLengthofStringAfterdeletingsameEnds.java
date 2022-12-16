package twopointer;

import org.junit.Test;

public class LC_1750_MinimumLengthofStringAfterdeletingsameEnds {

    /*Pseudo-code
    1. take two pointer left=0, right=length-1
    2. Compare character at left and right position
    3. if left charcter matches, right character
    4. move left and right till it matches same chacrter
    5. do the same till left < right
    6. return right-left-1

     */

    @Test
    public void testdata1(){
        String s = "ca";
        //output = 2
        int out = minimumLength(s);
        System.out.println(out);
    }

    @Test
    public void testdata2(){
        String s = "cabaabac";
        //output = 0
        int out = minimumLength(s);
        System.out.println(out);
    }

    @Test
    public void testdata3(){
        String s = "aabccabba";
        //Expected = 3
        int out = minimumLength(s);
        System.out.println(out);
    }
    @Test
    public void testdata4(){
        String s = "acabaabacc";
        //Expected = 10
        int out = minimumLength(s);
        System.out.println(out);
    }

    @Test
    public void testdata5(){
        String s = "bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb";
        //Expected = 1
        int out = minimumLength(s);
        System.out.println(out);
    }



    /* Time Complexity = O(N), Space Complexity = O(1) */

    public int minimumLength(String s) {

        int left=0, right=s.length()-1;

        while(left<right){

            if(s.charAt(left)==s.charAt(right)){
                char temp = s.charAt(left);
                while(s.charAt(left)==temp && left<right ){
                    left++;
                }
                while(s.charAt(right)==temp && right>=left){
                    right--;
                }

            } else return right-left+1;

        }

        return (left==right)?1:0;

    }
}
