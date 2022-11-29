package SlidingWindow.Stack_Problems;

import org.junit.Test;

import java.util.Stack;

public class LC_394_DecodeString {
    /*Pseudo-code
    1. Traverse each character in String
    2. When the character is ']' , pop out the character till the character is '['
    3. Add the pop character's to stringbuilder and reverse it
    3. when the character is not ']', push it to Stack
    4. When the character is digit, peek till character is not digit.
    5. use loop till i less than digit - append the same string.
    6. add the reverse to stack.
    7. return the stack of string characters in reverse order.

     */

    @Test
    public void testdata1(){

        String input = "10[a2[c]]";
        String output = decodeString(input);
        System.out.println(output);
        // Output: "accaccacc";

    }
    public String decodeString(String s) {
        if(s.length()<=1) return  s;
        Stack<Character> stack = new Stack<Character>();
        for(char c:s.toCharArray()){ //m

            if(c!=']'){
                stack.push(c);
            } else {
                StringBuilder sb = new StringBuilder();
                while(stack.peek()!='['){
                   sb.append(stack.pop());
                }
                stack.pop();
                StringBuilder digit = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                       digit.append(stack.pop());
                }
                int count = Integer.parseInt(digit.reverse().toString());

                for(int i = 1; i <= count; i++){ //n

                    for(int j=sb.length()-1;j>=0;j--){ //l
                        stack.push(sb.charAt(j));
                    }
                }

            }
        }
        StringBuilder decodeString = new StringBuilder();
        while(!stack.isEmpty()){
            decodeString.append(stack.pop());

        }
        return  decodeString.reverse().toString();
    }



}
