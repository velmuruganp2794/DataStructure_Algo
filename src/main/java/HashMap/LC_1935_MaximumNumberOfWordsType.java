package HashMap;

import org.junit.Test;

import java.util.HashSet;

public class LC_1935_MaximumNumberOfWordsType {

    /* Pseudo code
   1. Split string into string array of words
   2. put all the brokenLetters into set
   3. traverse each word and find word contain brokenletter
   4. if no, increase counter.
   5. return count;
   */
    /* Time Complexity = O(N*M), Space Complexity = O(N) */

    @Test
    public void testdata1(){
       String text = "hello world";
       String bl = "ad";
        System.out.println(canBeTypedWords(text,bl));
    }

    @Test
    public void testdata2(){
        String text = "leet code";
        String bl = "lt";
        System.out.println(canBeTypedWords(text,bl));
    }

    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;

        HashSet<Character> set = new HashSet<>();

        for(char c:brokenLetters.toCharArray()) set.add(c);

        for(String word:text.split(" ")){
            boolean flag=true;

            for(char c:set){
                if(word.indexOf(c)!=-1){
                    flag=false;
                    break;
                }
            }
            if(flag) count++;


        }


        return count;

    }
}
