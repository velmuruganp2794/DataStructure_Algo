package twopointer;

import org.junit.Test;

public class Palindrome {
	
	/*Testdata:
		String s="RADAR";
        Output = true;*/
	
	/*Pseudo code:
		1. left=0, right =length-1
		2. travese with two pointers
		3. check s.charAt(left)==charAt(right) else return false.
		4. If yes, left++, right--;
		5. Out side loop return true;*/

	@Test
	public void positive(){
		
		String s= "malayalam";
		boolean palindrome = palindrome_twoPointer(s);
		System.out.println("Positive cacse "+palindrome);
		
		
	}
	@Test
	public void negative(){
		
		String s= "Vel";
		boolean palindrome = palindrome_twoPointer(s);
		System.out.println("Negative Case "+palindrome);
		
		
	}
	
	public boolean palindrome_twoPointer(String s){
		int left=0, right=s.length()-1;
		
		while(left<right){
			
			if(s.charAt(left)==s.charAt(right)) {
				left++;
				right--;
			} else return false;
		}
		
		return true;
		
	}

}
