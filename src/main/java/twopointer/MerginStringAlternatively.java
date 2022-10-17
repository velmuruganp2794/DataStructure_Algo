package twopointer;

public class MerginStringAlternatively {

	public static void main(String[] args) {
		
		MerginStringAlternatively obj = new MerginStringAlternatively();
		String mergeAlternately = obj.mergeAlternately("abc", "pqr");
		System.out.println(mergeAlternately);
	}
	
	 public String mergeAlternately(String word1, String word2) {
	        
	        String output="";
	        int len1=word1.length(), len2=word2.length();
	        int m=0, n=0;
	        while(m < len1 && n < len2 ){
	          
	          output = output +word1.charAt(m)+word2.charAt(n);
	          m++;
	          n++;

	        }
	        if(m<len1) output = output+word1.substring(m);
	        if(n<len2) output = output+word2.substring(n);
	         return output;
	    }

}
