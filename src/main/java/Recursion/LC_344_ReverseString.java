package Recursion;

public class LC_344_ReverseString {
    //Recursion.
    /* Pseudo-code
    1. Break condition
    2. Actual code
    3. Call recursive
     */
    public void reverseString(char[] s) {
        swap(s,0,s.length-1);
    }

    public void swap(char[] s, int point1, int point2){
        if(point1>=point2) return;
        char temp = s[point1];
        s[point1] = s[point2];
        s[point2] = temp;
        swap(s,point1+1,point2-1);

    }
}
