package SlidingWindow.Stack_Problems;

import org.junit.Test;

import java.util.Stack;

public class LC_1544_MakeStringGreat {

    /*
    Pseudo-code
    1. Add first charater to stack
    2. loop over the string from 1 index
    3. check the string index charcter equal to stack peek (sameCharcter lowerCase,upperCase)
    4. if yes, remove from stack
    5. else add to stack
    6. do the same for all the charcter
    7. return stack of charcater as string
     */

    /*Time Complexity - O(N+M) , worst case - O(2N) = O(N), SpaceComplexity - O(N) */

    @Test
    public void testdata1(){
        String s = "leEeetcode";
        //Output: "leetcode"
        String output = makeGood(s);
        System.out.println(output);
    }

    @Test
    public void testdata2(){
        String s = "abBAcC";
        //Output: "leetcode"
        String output = makeGood(s);
        System.out.println(output);
    }

    @Test
    public void testdata3(){
        String s = "s";
        //Output: "leetcode"
        String output = makeGood(s);
        System.out.println(output);
    }

    public String makeGood(String s) {

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for (int i=1;i<s.length();i++){

            if(!stack.isEmpty() && badString(stack.peek(),s.charAt(i))) stack.pop();
            else stack.push(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<stack.size();i++){
            sb.append(stack.get(i));
        }
        return sb.toString();

    }

    public boolean badString(char c, char c1){

        if(Character.isLowerCase(c) && Character.toUpperCase(c)==c1)
            return true;
        else if(Character.isUpperCase(c) && Character.toLowerCase(c)==c1)
            return true;
        return false;
    }
}
