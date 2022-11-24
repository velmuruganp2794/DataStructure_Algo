package Stack_Problems;

import org.junit.Test;

import java.util.Stack;

public class LC_682_BaseballGmae {

    @Test
    public void testdata(){
        String input[] = {"5","-2","4","C","D","9","+","+"};
        calPoints(input);
    }

    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum=0;

        for(String operation:operations){
            int length = stack.size()-1;

            if(operation.equals("+")){
                stack.push(stack.get(length)+stack.get(length-1));

            } else if(operation.equals("D")) stack.push(2*stack.get(length));

            else if(operation.equals("C")) stack.pop();
            else if(Character.isDigit(operation.charAt(0))){
                stack.push(Integer.parseInt(operation));
            }

        }
        System.out.println(stack);

        for(int i=0;i<stack.size();i++){
            sum += stack.get(i);
        }

        return sum;
    }
}
