package SlidingWindow.Stack_Problems;

import java.util.Stack;

public class LC_1047_RemoveAdjacentDuplicatesInString {

    /* PseudoCode
   1. Traverse each character in string
   2. if character is equal to peek, pop out from stack
   3. else add to stack
   4. traverse each charcter in stack and add it to stringbuikder
   5. return stringbuilder as string
   */

    /*Time Complexity - O(N), Space Complexity - O(N) */
    public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for(int i=1;i<s.length();i++){

            if(!stack.isEmpty() && stack.peek()==s.charAt(i)) stack.pop();
            else stack.push(s.charAt(i));

        }
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<stack.size();i++){
            sb.append(stack.get(i));

        }
        return sb.toString();
    }
}
