package ExpandFromCenter;

import org.junit.Test;

public class LC_005_LongestPalindrome {
	
	/*Pseudo Code: Expand from center
	  1. Declare palindormeSubsstring as "", MaxPalindrome;
	  2. traverse each char in the string in for loop
	  3. Get a substring of left, right (i,i).
	  4. check the palindrome for the substring and expand left, right
	  5. compare palindromeSubstring length with Maxpalindrome length and maxlength string should be re-assigned
	  6. Get a substring of left, right (i,i+1). => eg: abccba
	  7. check the palindrome for the substring and expand left, right
	  8. compare palindromeSubstring length with Maxpalindrome length and maxlength string should be re-assigned
	 */
	
	/* Time complexity - O(n2);
	   Space Complexity - O(1)
	 */
	
	@Test
    public void test1(){
        String s ="babad";
        System.out.println(palindromeString(s));
    }


   // @Test
    public void test2(){
        String s ="cbbd";
        System.out.println(palindromeString(s));
    }

   // @Test
    public void test3(){
        String s = "dbcbcbdghi";
        System.out.println(palindromeString(s));
    }
	
	private String palindromeString(String str){ //babad
        if(str.length()<2)return str;
        String maxPalindrome="";
        String palindromeSubstring;
        for(int i=0;i<str.length()-1;i++){
            palindromeSubstring=plaindromic(str,i,i);
            maxPalindrome=palindromeSubstring.length()>maxPalindrome.length()?palindromeSubstring:maxPalindrome;
            palindromeSubstring=plaindromic(str,i,i+1);
            maxPalindrome=palindromeSubstring.length()>maxPalindrome.length()?palindromeSubstring:maxPalindrome;

        }
        return maxPalindrome;
    }



    private String plaindromic(String str, int  left,int right){
        String palindrome;
        while(left>=0 && right <str.length()&& str.charAt(left)==str.charAt(right)){
            left--;
            right++;
        }
        palindrome=str.substring(left+1,right);
        return palindrome;
    }

}
