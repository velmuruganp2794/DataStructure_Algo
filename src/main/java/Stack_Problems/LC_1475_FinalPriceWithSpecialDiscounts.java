package Stack_Problems;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

public class LC_1475_FinalPriceWithSpecialDiscounts {
    /*Pseudo-code
    1. If stack is empty push the element index to stack
    2. else check the peek is >= current element
    3. if yes, put peek-current element  in the peek index. check for remaining element in stack.
    4. else put the element index into stack
    5. return output array
     */

    /*Time Complexity = O(N), Space Complexity = O(N) */

    @Test
    public void testdata1(){
        int[] prices = new int[] {8,4,6,2,3};
        int[] out = finalPrices(prices);
        System.out.println(Arrays.toString(out));
    }

    @Test
    public void testdata2(){
        int[] prices = new int[] {1,2,3,4,5};
        int[] out = finalPrices(prices);
        System.out.println(Arrays.toString(out));
    }

    @Test
    public void testdata3(){
        int[] prices = new int[] {10,1,1,6};
        int[] out = finalPrices(prices);
        System.out.println(Arrays.toString(out));
    }

    public int[] finalPrices(int[] prices) {

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<prices.length;i++){
                while(!stack.isEmpty() && prices[stack.peek()]>=prices[i]){
                    prices[stack.peek()] = prices[stack.peek()] - prices[i];
                    stack.pop();
                }
                stack.push(i);
        }


      return prices;
    }
}
