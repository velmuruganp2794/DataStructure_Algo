package Assessment;

import org.junit.Test;

public class LC_2108_FirstPalindrome {

    /*Pseudo-code
    1. Tarverse each words in String array
    2. use two pointer logic and check palindrome or not
    3. if palindrome return that word.
     */

    @Test
    public void testdata1(){

        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));

    }

    @Test
    public void testdata2(){

        String[] words = {"notapalindrome","racecar"};
        System.out.println(firstPalindrome(words));

    }

    @Test
    public void testdata3(){

        String[] words = {"def","ghi"};
        System.out.println(firstPalindrome(words));

    }

    public String firstPalindrome(String[] words) { // O(M*N)

        for(String word:words){ //O(M)
            if(validpalindrome(word)) return word; // O(N)
        }


       return "";
    }

    public boolean validpalindrome(String word){ //O(n)
        int start=0, end = word.length()-1;

        while(start<end){
            if(word.charAt(start)==word.charAt(end)){
                start++;
                end--;
            } else return false;
        }
        return true;
    }
}
