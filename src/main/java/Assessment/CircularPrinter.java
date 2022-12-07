package Assessment;

import org.junit.Test;

import java.util.ArrayList;

public class CircularPrinter {
    /*Pseudo-code
    1. Calculate time taken to reach first character from 'A' in  both the direction
    2. Find the minimum time and add it to result
    3. Traverse from 1st index in string and find the distance from previous character in both the direction
    4. Add the minimum time taken to result
    5. do the same till last character in string
     */

    @Test
    public void testdata1(){
        String s = "BZA";
        int output = minimumTime(s);
        System.out.println(output);new ArrayList<>();
    }

    @Test
    public void testdata2(){
        String s = "AZGB";
        int output = minimumTime(s);
        //13
        System.out.println(output);
    }

    @Test
    public void testdata3(){
        String s = "ZNMD";
        //23
        int output = minimumTime(s);
        System.out.println(output);
    }

    public int minimumTime(String s){

        int minimumTime =0;
        int lefttime, righttime;

        lefttime = Math.abs('A' - s.charAt(0));
        righttime = 26 - lefttime;
        minimumTime = Math.min(lefttime,righttime);

        for(int i=1;i<s.length();i++){

            lefttime = Math.abs(s.charAt(i-1) - s.charAt(i));
            righttime = 26 - lefttime;
            minimumTime += Math.min(lefttime,righttime);
        }

        return minimumTime;

    }
}
