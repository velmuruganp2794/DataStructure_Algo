package twopointer;

import org.junit.Test;

public class LC_680_ValidPalindromeII {
	
	/*Problem:
		Given a string s, return true if the s can be palindrome after deleting at most one character from it.*/
	
	/*Test data:
		
		Positive:
			String input = "aba";
	        output = false;
		Edge:
			
		String input = "ebcbbececabbacecbbcbe";
        output => true*/
	
	/*Pseudo code:
		1.Use two pointer left=0, right=length-1
		2. compare both the left char and right char.
		3. if both are equal , do left++, right--
		4. else neglect left and find palindrome check from left++ to right chars in the string
		5. or neglect right and find palindrome check from left to right--
		6. if any one is true, return true
		7. else return false.		*/
	
	/*Time complexity = O(n)
	Space complexity = O(1)*/
		
	
	@Test
	public void positive(){
		
		String input = "ebcbbececabbacecbbcbe";
		boolean validPalindrome = validPalindrome(input);
		System.out.println(validPalindrome);
		
	}
	
	public boolean validPalindrome(String s) {

		int left = 0, right = s.length() - 1;
		while (left < right) {

			if (s.charAt(left) == s.charAt(right)){
                   left++;
                   right--;
            }
			else if(isPalindrome(s, left,right-1) || isPalindrome(s,left+1,right)) return true;
            else return false;
						
			}	
		return true;

	}

    public boolean isPalindrome(String s, int left, int right){

        while(left<right){
             if(s.charAt(left)==s.charAt(right)) {
                 left++;
                 right--;
             }else return false;

        }

        return true;
    }

}
