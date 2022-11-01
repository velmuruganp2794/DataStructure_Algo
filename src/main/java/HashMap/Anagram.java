package HashMap;

import java.util.Arrays;

import org.junit.Test;

public class Anagram {
	
	/* Pseudo code - Brute Force
	 *1. Convert String into tocharArray
	 *2. sort both the array
	 *3. return true if both are equals else false 
	 */
	
	/* Pseudo code - Using Integer Array/ASCII values
	 1. Declare two count1, count2 int array with size of 256 (All the ASCII values)
	 2. if s.length() != t.length return false
	 3. if length are equal for s and t, then traverse the chars in string and increment the values of count1[SeachChar] count2[teachChar]
	 4. use another for loop from 0 to 256, and check count1[i]!=count2[i], return false. else true.
	 */
	
	@Test
	public void example1(){
		String s = "anagram", t="nagaram";
		//boolean checkAnagram = checkAnagram(s, t);
		//System.out.println(checkAnagram);
		//boolean checkAnagram1 = checkAnagram_UsingAsciiValues(s, t);
		//System.out.println(checkAnagram1);
		boolean checkAnagram2 = checkAnagram_UsingAsciiValuesIII(s, t);
		System.out.println(checkAnagram2);
		
	}
	
	//@Test
	public void example2(){
		String s = "anagram", t="nagaray";
		boolean checkAnagram = checkAnagram(s, t);
		System.out.println(checkAnagram);
		
	}
	
	public boolean checkAnagram(String s, String t){
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		
		if(Arrays.equals(sArray,tArray)) return true;
		else return false;
	
		
	}
	
	public boolean checkAnagram_UsingAsciiValues(String s, String t){
		
		 if(s.length() != t.length()) return false;
		
		int[] counts = new int[256];
		int[] countt = new int[256];//Since we have 256 values in Ascii
		
		for(int i=0;i<s.length();i++){
			counts[s.charAt(i)] = counts[s.charAt(i)]+1;
			countt[t.charAt(i)] = countt[t.charAt(i)]+1;
					
		}
		
		for(int i=0;i<counts.length;i++){
			if(counts[i] != countt[i]) return false;
			
		}
		
		
		return true;
	
		
	}
	
	public boolean checkAnagram_UsingAsciiValuesII(String s, String t){
		
		 if(s.length() != t.length()) return false;
		
		int[] counts = new int[26];
		int[] countt = new int[26];//Since we have 26 values for lowercase
		
		for(int i=0;i<s.length();i++){
			counts[s.charAt(i)-'a'] = counts[s.charAt(i)-'a']+1;
			countt[t.charAt(i)-'a'] = countt[t.charAt(i)-'a']+1;
					
		}
		
		for(int i=0;i<counts.length;i++){
			if(counts[i] != countt[i]) return false;
			
		}
		
		
		return true;
	
		
	}
	
	public boolean checkAnagram_UsingAsciiValuesIII(String s, String t){
		
		 if(s.length() != t.length()) return false;
		
		int[] count = new int[26];
		
		
		for(int i=0;i<s.length();i++){
			count[s.charAt(i)-'a'] = count[s.charAt(i)-'a']+1;
			
					
		}
		
		for(int i=0;i<t.length();i++){
			count[t.charAt(i)-'a'] = count[t.charAt(i)-'a']-1;
		}
		
		for(int i=0;i<count.length;i++){
			if(count[i] != 0) return false;
		}
		
		
		return true;
	
		
	}


}
