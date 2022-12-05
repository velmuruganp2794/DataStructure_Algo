package Recursion;

import org.junit.Test;

public class LC_509_FibonacciNumber {
    //Recursion example

    @Test
    public void testdata1(){
        int n=4;
        int out = fib_recursion(n);
        System.out.println(out);
    }

    public int fib(int n) {

        int count=2;
        int pre = 0, last = 1;
        if(n==0) return pre;
        if(n==1) return last;

        while(count<=n){
            int next = pre+last;
            pre = last;
            last = next;
            count++;

        }
        return last;
    }

    public int fib_recursion(int n) {
       if(n==0||n==1) return n;
       int output = fib_recursion(n-1)+fib_recursion(n-2);
       return output;
    }

}
