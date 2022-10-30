package bruteForce;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class LC_1763_LongestNiceSubstring {
	
	/* Pseudo Code: Brute Force
	 1. Let MaxLengthNiceSubstring=""; 
	 1. use two for loops to get each substring of i'th character in the string 
	 2. Add the charcter in the substring into HashSet.
	 3. Check the charcter in the HashSet is lower case, if yes check upper case char is available in the string.
	 4.  Check the charcter in the HashSet is upper case, if yes check lower case char is available in the string.      
	 5. If the condition satisfy for all the chars in hashset, return true as Nice substring
	 6. MaxLengthNiceSubstring length < current nice substring, re-assign the string to MaxLengthNiceSubstring
	 7. Return MaxLengthNiceSubstring
	 */
	
	/* Time Complexity = O(n^3)
	   Space Complexity = O(n)
	 
	 
	 */
	
	
	//@Test
	public void positive(){
		
		String s="YazaAay";
		String longestNiceSubstring = longestNiceSubstring(s);
		System.out.println(longestNiceSubstring);
	}
	
	//@Test
	public void positive1(){
		
		String s="Bb";
		String longestNiceSubstring = longestNiceSubstring(s);
		System.out.println(longestNiceSubstring);
	}
	
	@Test
	public void edge(){
		
		String s="ccccccccccccccccccccccccccccC";
		String longestNiceSubstring = longestNiceSubstring(s);
		System.out.println(longestNiceSubstring);
	}
	
	@Test
	public void negative(){
		
		String s="c";
		String longestNiceSubstring = longestNiceSubstring(s);
		System.out.println(longestNiceSubstring);
	}
	
	
	
	
	
	public String longestNiceSubstring(String s) {

	     String MaxLengthNiceSubstring="";
	     
	     for(int i=0;i<s.length();i++){

	         for(int j=i+1;j<=s.length();j++){
	             
	             String substring = s.substring(i,j);
	             if(NiceString(substring) && substring.length() > MaxLengthNiceSubstring.length()){

	                 MaxLengthNiceSubstring = substring;
	                
	                

	             }

	         }

	        
	     }

	     return MaxLengthNiceSubstring;
	    }

	    public boolean NiceString(String nice){

	          HashSet<Character> set = new HashSet<Character>();
	          
	          for(int k=0;k<nice.length();k++){
	              set.add(nice.charAt(k));
	          }

	          for(int l=0;l<nice.length();l++){

	             if(Character.isLowerCase(nice.charAt(l)) && !set.contains(Character.toUpperCase(nice.charAt(l)))) return false;
	             if(Character.isUpperCase(nice.charAt(l)) && !set.contains(Character.toLowerCase(nice.charAt(l)))) return false;
	             
                  
	          }

	          return true;

	    }

}
