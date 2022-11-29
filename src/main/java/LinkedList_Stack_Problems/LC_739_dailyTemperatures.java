package LinkedList_Stack_Problems;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

public class LC_739_dailyTemperatures {

    /* Pseudo-code
    1. Declare output array and stack
    2. traverse input array check if stack is empty
    3. if yes, push the index to stack
    4. else check if the index value greater than to peek, add index - peek to output[peek]
    5. else push to stack.
    6. return output array.
     */

    /*Time Complexity = O(N), Space Complexity - O(N) */

    @Test
    public void testdata1(){

        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] output = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(output));

    }

    @Test
    public void testdata2(){

        int[] temperatures = {30,40,50,60};
        int[] output = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(output));

    }

    @Test
    public void testdata3(){

        int[] temperatures = {90,60,30};
        int[] output = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(output));

    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i=0;i<temperatures.length;i++){

            if(stack.isEmpty()) stack.push(i);
            else {

                while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                    output[stack.peek()] = i - stack.peek();
                    stack.pop();

                }
                stack.push(i);
            }
        }
        return output;
    }
}
