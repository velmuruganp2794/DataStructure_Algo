package twopointer;

import org.junit.Test;

public class LC_28_FindtheIndexoftheFirstOccurrenceinaString {

    /* Pseudo-code
    1. Declare start=0 pointer=0;
    2. Traverse each char in string and check matching with first char in needle string
    3. if yes, check the remaining char matches
    4. if no, move the start from the 1st string to next char which matces needle starting char
    5. if all the char matches, return start position
    6. if no matches found return -1
     */
 @Test
    public void testdata1(){
        String haystack = "sadbutsad";
        String needle = "sad";
        int index = strStr(haystack,needle);
        System.out.println(index);
    }

    @Test
    public void testdata2(){
        String haystack = "leetcode";
        String needle = "leeto";
        int index = strStr(haystack,needle);
        System.out.println(index);
    }

    @Test
    public void testdata3(){
        String haystack = "mississippi";
        String needle = "issip";
        //output = 4;
        int index = strStr(haystack,needle);
        System.out.println(index);
    }

    public int strStr(String haystack, String needle) {

     int length = haystack.length()-needle.length();
     for(int start = 0;start<=length;start++){
         int pointer=0;

         while(pointer < needle.length() && haystack.charAt(start+pointer)==needle.charAt(pointer))
             pointer++;
         if(pointer==needle.length()) return start;

     }

    return -1;
    }
}
