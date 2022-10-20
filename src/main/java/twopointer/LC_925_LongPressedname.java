package twopointer;

public class LC_925_LongPressedname {
	
	/* Testdata:
		
		Positive:
			Input: name = "alex", typed = "aaleex"
			Output: true
			Explanation: 'a' and 'e' in 'alex' were long pressed.
		Negative:
			Input: name = "saeed", typed = "ssaaedd"
			Output: false
			Explanation: 'e' must have been pressed twice, but it was not in the typed output.
		
		Edge:
			input: name = leelee , typed = "lleeelee"; Output: false 
			
			*/
	
	
	/*
	    Pseudo Code:
		
		1. Check both the length (name , typed)
		2. If(name.length==typed.length) then check both are equal. if yes return true else false.
		3. if(name.length > typed.length) return false;
		4. if starting char or ending char not equal with both the string, return false.
        4. Traverse each char from both the arrays with left=0, right=0;
        5. if(name[left] == typed[right], do increment left, right
        6. else if(name[left-1] == typed[right]), do increment right
        7. else return false
        8. check remaining chars in right string
        9. traverse remaining chars in typed, check name[length-1]==typed(right) if yes, right++ else return false. 
        */
	
	public boolean isLongPressedName(String name, String typed) {

	       int left=0, right=0;
	       if(name.length()>typed.length())  return false;
	       if(name.length()==typed.length()) return (name.equals(typed)) ? true:false;
	       if(name.charAt(left)!=typed.charAt(right) || name.charAt(name.length()-1) !=typed.charAt(typed.length()-1)) return false;
	          while(left < name.length() && right < typed.length()){
	                
	                 if(name.charAt(left)==typed.charAt(right)) {
	                 right++; 
	                 left++;
	                 } else if(name.charAt(left-1)==typed.charAt(right)){
	                     right++;
	                 } else return false;

	          }
	         
	          while(right<typed.length()){
	             if(name.charAt(left-1)!=typed.charAt(right)) return false;
	             else right++;
	          }


	          return true;
	    }

}
