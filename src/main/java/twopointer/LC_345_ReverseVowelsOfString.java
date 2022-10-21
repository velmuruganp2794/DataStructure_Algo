package twopointer;

import java.util.Arrays;

import org.junit.Test;

public class LC_345_ReverseVowelsOfString {
	
	/*Problem: 
		Given a string s, reverse only all the vowels in the string and return it.

		The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
*/
	
	
	/*Testdata:
		Positive :
			
		Input: s = "hello"
		Output: "holle"
			
	    Negative :
	    	
	    Input: s = "leetcode"
	    Output: "leotcede"	*/
	
	/*
			Pseudo code:
		1. Convert string to array using toChararray()
		2. use two pointer left=0, right=string.length();
        3. if arr[left] and arr[right] are vowels (a,e,i,o,u,A,E,I, O, U), swap the char.
        4. if(arr[left]) is not vowel, left++
        5. If arr[right] is notvowel , right--
        6. do the step 1,2,3 till left < right => (while(left<right))
        
        */
	
	//@Test
	public void positive(){
		String s="hello";
		String reverseVowels = reverseVowels(s);
		System.out.println(reverseVowels);
	}
	
	@Test
	public void edge(){
		String s="Ui";
		String reverseVowels = reverseVowels(s);
		System.out.println(reverseVowels);
		
	}
	
	public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left=0, right=s.length()-1;

        while(left < right){
          
          if((chars[left]=='a' || chars[left]=='e' || chars[left]=='i' || chars[left]=='o' 
          || chars[left]=='u' || chars[left]=='A' || chars[left]=='E' || chars[left]=='I' 
          || chars[left]=='O' || chars[left]=='U') &&  
          (chars[right]=='a' || chars[right]=='e' || chars[right]=='i' || chars[right]=='o' 
          || chars[right]=='u' || chars[right]=='A' || chars[right]=='E' || chars[right]=='I' 
          || chars[right]=='O' || chars[right]=='U')){
              char temp=chars[left];
              chars[left]=chars[right];
              chars[right]=temp;
              left++;
              right--;
          }

           if(chars[left]!='a' && chars[left]!='e' && chars[left]!='i' && chars[left]!='o' 
          && chars[left]!='u' && chars[left]!='A' && chars[left]!='E' && chars[left]!='I' 
          && chars[left]!='O' && chars[left]!='U') left++;


           if(chars[right]!='a' && chars[right]!='e' && chars[right]!='i' && chars[right]!='o' 
          && chars[right]!='u' && chars[right]!='A' && chars[right]!='E' && chars[right]!='I' 
          && chars[right]!='O' && chars[right]!='U') right--;      


        }
        return String.valueOf(chars);

    }
}
