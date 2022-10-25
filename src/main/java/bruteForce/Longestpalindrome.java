package bruteForce;

import org.junit.Test;

public class Longestpalindrome {
	
	
	//@Test
	public void example1(){
		
		String input = "babad";
		String longestPalindrome = longestPalindrome(input);
		System.out.println(longestPalindrome);
	}
	
	@Test
	public void example2(){
		
		String input = "aacabdkacaa";
		String longestPalindrome = longestPalindrome(input);
		System.out.println(longestPalindrome);
	}
	
	//@Test
	public void example3(){
		
		String input = "a";
		String longestPalindrome = longestPalindrome(input);
		System.out.println(longestPalindrome);
	}
	
	public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        if(s.length()==2 && s.charAt(0)!=s.charAt(1)) return s.substring(0,1);
        StringBuilder longPalindrome= new StringBuilder();
          
          for(int i=0;i<s.length();i++){
        	  StringBuilder palindromCheck = new StringBuilder();
              
              if(s.lastIndexOf(s.charAt(i))==i) continue;
              else {
                 
                 palindromCheck = palindromCheck.append(checkpalindrome(s,i,s.lastIndexOf(s.charAt(i))));
                 if(palindromCheck.length()>1) {
                	 
                	 longPalindrome = (longPalindrome.length() > palindromCheck.length()) ? longPalindrome:palindromCheck;
                 }

              }


          }

        return longPalindrome.toString();
    } 

    public String checkpalindrome(String temp, int startIndex, int endIndex){
       boolean flag=true;
       int left=startIndex, right=endIndex;
       while(endIndex!=startIndex){
          while(left<right){

             if(temp.charAt(left++)!=temp.charAt(right--)) {
                 flag=false;
             }

          }
          if(flag==true) return temp;
          else {
        	  endIndex = temp.lastIndexOf(temp.charAt(startIndex),endIndex-1);
              temp=temp.substring(startIndex,endIndex+1);
             
         } 
       }
       return "";
         
        
       
    }
}
