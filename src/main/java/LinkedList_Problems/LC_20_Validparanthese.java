package LinkedList_Problems;

import org.junit.Test;

import java.util.Stack;

public class LC_20_Validparanthese {

    /* Pseudo code
   1. Traverse the chars in string
   2. add the chars if (, {, [ to stack
   3. if the char is ),},], then check for the peek. if Stack is empty - return false;
   4. if peek is open brackets for closed one, pop it
   5. Else return false.
   6. End return true if stack is empty, else false;

   */
    /* Time Complexity - O(n), Space Complexity - O(n) */

    @Test
    public void testdata1(){
        String s = "()";
        System.out.println(isValid(s));

    }

    @Test
    public void testdata2(){
        String s = "()[]{}";
        System.out.println(isValid(s));

    }

    @Test
    public void edge(){
        String s = "(";
        System.out.println(isValid(s));

    }

    @Test
    public void edge1(){
        String s = ")]}";
        System.out.println(isValid(s));

    }

    @Test
    public void testdata3(){
        String s = "(]";
        System.out.println(isValid(s));

    }
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){

            if(c =='(' || c=='{' || c=='[') stack.push(c);
            else {
                if(stack.isEmpty()) return false;
                char top = stack.peek();
                if((c==')' && top=='(') || (c=='}' && top=='{') || (c==']' && top=='[')) stack.pop();
                else return false;

            }

        }

        return stack.isEmpty();

    }
}
