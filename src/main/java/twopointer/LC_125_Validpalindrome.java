package twopointer;

public class LC_125_Validpalindrome {
/* Problem: A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
 * and removing all non-alphanumeric characters, 
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * 
 * 2. Test data
 * 
 * Positive: 
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * 
 * Negative: 
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * 
 * Edge:
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 * 
 * Psuedo code:
 * ============
 * 1. Convert given string into lowercase
 * 2. remove all alphanumeric from string using replaceAll method/ regex [^0-9a-z]
 * 3. if string is empty, return true
 * 4. use two pointers start=0, end= string.length-1
 * 5. Compare both the position character and increment start and decrement end if both are same
 * 6. if both are same, do the same till start < end. finally return true.
 * 7. if both are not same, return false.
 * 
 * 
 * Time Complexity = O(n)
 * Space complexity = O(1)
 * 
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		LC_125_Validpalindrome obj = new LC_125_Validpalindrome();
		
		System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));

	}
	
	public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^0-9a-z]","");
        int start=0, end=s.length()-1;
       System.out.println("length ="+s.length()+ " "+start + " "+end);
        while(start < end){
          
          if(s.charAt(start)==s.charAt(end)){
              start++;
              end--;
          } else return false;

        }

        return true;

    }
	
	
	

}
