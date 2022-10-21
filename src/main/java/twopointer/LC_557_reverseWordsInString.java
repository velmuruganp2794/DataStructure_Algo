package twopointer;

import org.junit.Test;

public class LC_557_reverseWordsInString {
  
	/* Problem: 
		 Given a string s, reverse the order of characters in each word within a sentence 
	     while still preserving whitespace and initial word order.
	     
	 Positive: 
	      Input: s = "Let's take LeetCode contest"
	      Output: "s'teL ekat edoCteeL tsetnoc"
	 
	 Pseudo Code:
		 1. Use spilt(" ") and store it string array
		 2. iterate each words in array and reverse 
		 3. reverse eachword and add it to Stringbuilder.append(); 
		 4. return output string
	    		 
	   */
	
	/*TimeComplexity = O(n*m)
	SpaceComplexity = O(n)*/
	
	
	@Test
	public void positive(){
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}
	     		 
	 
	public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder outputString = new StringBuilder("");

        for(int i=0;i<words.length;i++){
            if(i==words.length-1) outputString =  outputString.append(reverse(words[i]));
            else outputString =  outputString.append(reverse(words[i])).append(" ");     
      
        }
      return outputString.toString();

    }

    public String reverse(String word){
        StringBuilder reverseWord=new StringBuilder("");
        for(int i=word.length()-1;i>=0;i--){
            reverseWord = reverseWord.append(word.charAt(i));
            
        }
        return reverseWord.toString();
    }
}
