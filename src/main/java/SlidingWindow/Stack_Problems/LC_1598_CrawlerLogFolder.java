package SlidingWindow.Stack_Problems;

import org.junit.Test;

import java.util.Stack;

public class LC_1598_CrawlerLogFolder {

    /*Pseudo-Code
    1. traverse each string in logs array
    2. if string equals "../" pop the stack if it not empty
    3. else if string equals "./", dont perform any operation
    4. else push it to stack
    5. return the size of the stack
     */

    /*time complexity = O(N), Space Complexity = O(N) */

    @Test
    public void testdata1(){

        String[] logs = {"d1/","d2/","../","d21/","./"};
        int output = minOperations(logs);
        //2
        System.out.println(output);
    }

    @Test
    public void testdata2(){

        String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
        int output = minOperations(logs);
        //3
        System.out.println(output);
    }

    @Test
    public void testdata3(){

        String[] logs = {"d1/","../","../","../"};
        int output = minOperations(logs);
        //0
        System.out.println(output);
    }

    @Test
    public void testdata4(){

        String[] logs = {"./","../","./"};
        int output = minOperations(logs);
        //0
        System.out.println(output);
    }

    public int minOperations(String[] logs) {

        Stack<String> stack = new Stack<>();
        for(String log:logs){

            if(log.equals("../")) {
                if(!stack.isEmpty())stack.pop();
            }
            else if(!log.equals("./")) stack.push(log);

        }

        return stack.size();

    }

    /*Time Complexity = O(N), Space Complexity = O(1) */

    public int minOperations_Count(String[] logs) {

        int count=0;
        for(int i=0;i<logs.length;i++){

            if(logs[i].equals("../")) {
                if(count!=0) count--;
            }
            else if(!logs[i].equals("./"))  count++;
        }
        return count;
    }
}
