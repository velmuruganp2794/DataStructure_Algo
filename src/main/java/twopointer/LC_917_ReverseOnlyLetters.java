package twopointer;

import org.junit.Test;

public class LC_917_ReverseOnlyLetters {
	
	/*Problem:
		Given a string s, reverse the string according to the following rules:

			All the characters that are not English letters remain in the same position.
			All the English letters (lowercase or uppercase) should be reversed.
			Return s after reversing it.*/
	
	/*Testdata:
		Input: s = "ab-cd"
		Output: "dc-ba"
		

		Input: s = "a-bC-dEf-ghIj"
		Output: "j-Ih-gfE-dCba"
		

		Input: s = "Test1ng-Leet=code-Q!"
		Output: "Qedo1ct-eeLg=ntse-T!"
		
		*/
	
	/*
	Pseudo Code
	
	1. Convert string to array using toChararray()
	2. use two pointer left=0, right=string.length();
    3. if arr[left]and arr[right] are letter [a-zA-z]), swap the char.
    4. if(arr[left]) is not letter, left++
    5. If arr[right] is not letter , right--
    6. do the step 1,2,3 till left < right => (while(left<right))
    
    */
	
	/*Time Complexity = O(n)
	Space Complexity = O(n)		*/
	
	@Test
	public void positive(){
		
		String input = "ab-cd";
		System.out.println(reverseOnlyLetters(input));
		
		
	}
	
	
	public String reverseOnlyLetters(String s) {

        int left=0, right=0;
        char[] arr = s.toCharArray();

        while (left < right){

         if(Character.isLetter(arr[left]) && Character.isLetter(arr[right])){

             char temp = arr[left];
             arr[left]=arr[right];
             arr[right] = temp;
             left++;
             right--;
         }

         if(!Character.isLetter(arr[left])) left++;
         if(!Character.isLetter(arr[right])) right--;



        }
        return String.valueOf(arr);
        
    }

}
