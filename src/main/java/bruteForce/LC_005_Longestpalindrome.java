package bruteForce;

import org.junit.Test;

public class LC_005_Longestpalindrome {
	
	/* Pseudo Code - Brute Force
	 1. Use two for loops. outer for loops to traverse from 0 to length of String
	 2. Inner for loop to get every substring of 'i'th char. ie - J=i;
	 3. get substring and check palindrome check.
	 4. If the substring is palindrome, find the maxLength subtring (Compare with previouse palindrome substring)
	 5. return palindrome string. 
	 */
	
	/* Time Complexity = O(m^3)
	 * Space Complexity = O(1)
	  
	 */
	 
	
	
	//@Test
	public void example1(){
		
		String input = "babad";
		String longestPalindrome = longestPalindrome(input);
		System.out.println(longestPalindrome);
	}
	
	//@Test
	public void example2(){
		
		String input = "aacabdkacaa";
		String longestPalindrome = longestPalindrome(input);
		System.out.println(longestPalindrome);
	}
	
	@Test
	public void example3(){
		
		String input = "aa";
		String longestPalindrome = longestPalindrome(input);
		System.out.println(longestPalindrome);
	}
	
	public String longestPalindrome(String s) { //babad
		
        if(s.length()==1) return s;
        StringBuilder longPalindrome= new StringBuilder();
        
        for(int i=0;i<s.length();i++){
        	boolean flag;
        	
        	for(int j=i+1;j<=s.length();j++){
        		
        		flag = polindomeCheck(s.substring(i,j));
        		
        		if(flag && s.substring(i,j).length() > longPalindrome.length()){
        			longPalindrome.setLength(0);
        			longPalindrome.append(s.substring(i,j));
        		}
        		   		
        		
        	}
        }

        return longPalindrome.toString();
    } 
	
	public boolean polindomeCheck(String substring){
		
		int start=0, end=substring.length()-1;
		while(start<end) {
				
				if(substring.charAt(start++) != substring.charAt(end--)) return false;
				
		}
			
		
		return true;
		
	}
    
}
