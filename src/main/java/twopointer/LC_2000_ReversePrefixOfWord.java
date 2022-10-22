package twopointer;

import org.junit.Test;

public class LC_2000_ReversePrefixOfWord {
	/*
	Problem: 
		Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). 
		If the character ch does not exist in word, do nothing.

		For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). 
		The resulting string will be "dcbaefd".
		Return the resulting string.
	*/
	
	/*Testdata:
		Example 1:

			Input: word = "abcdefd", ch = "d"
			Output: "dcbaefd"
			Explanation: The first occurrence of "d" is at index 3. 
			Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
			
		Example 2:	
			Input: word = "abcd", ch = "z"
			Output: "abcd"
			Explanation: "z" does not exist in word.
			You should not do any reverse operation, the resulting string is "abcd".*/
	
	
	/*Pseudo Code: Approach 1
		
		1. Check the index of given word. if -1, return given word.
		2. Else get substring of word from 0 to index of given char
		3. reverse the substring word and append it with remaining 
		4. return the final string*/
	
	/*Time complexity = O(n)
	Space Complexity = O(n)		*/
	
	@Test
	public void positive(){
		String word = "abcdefd";
		char ch = 'd';
		String reversePrefix = reversePrefix(word, ch);
		System.out.println(reversePrefix);
	}
	
	
	
	public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder("");
        int indexOfChar = word.indexOf(ch);
        if(indexOfChar==-1) return word;
        else sb = sb.append(reverse(word.substring(0,indexOfChar+1))).append( word.substring(indexOfChar+1));
        return sb.toString();
        
    }

     public String reverse(String word){
        StringBuilder reverseWord=new StringBuilder("");
        for(int i=word.length()-1;i>=0;i--){
            reverseWord = reverseWord.append(word.charAt(i));
            
        }
        return reverseWord.toString();
    }

}
