package HashMap;

import org.junit.Test;

import java.util.HashSet;

public class LC_1876_CountOfSubstringDistinct {

     /* Pseudo code:
       1. Declare count=0;
       2. while loop till s.length() >= 3 , get substring of 3 chars
       3. convert temp string to array and add chars to set. if set size is =3, increment count.
       4. re-initialize string to substring of next char to remaining
       5. return count

    */

     @Test
    public void testdata1(){
        String s = "xyzzaz";
        int count = countGoodSubstrings(s);
         System.out.println(count);
    }

    @Test
    public void testdata2(){
        String s = "aababcabc";
        int count = countGoodSubstrings(s);
        System.out.println(count);
    }

    public int countGoodSubstrings(String s) {
        int count=0;


            while(s.length() >= 3){
                HashSet<Character> temp = new HashSet<>();
                StringBuilder tempSubstring = new StringBuilder();

                tempSubstring.append(s.substring(0,3));

                for(int j=0;j<3;j++){
                    temp.add(tempSubstring.charAt(j));
                }
                if(temp.size()==3) count++;
                s = s.substring(1);
                //aababcabc


            }




        return count;

    }
}
