package HashMap;

import org.junit.Test;

import java.util.HashMap;
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

    public int countGoodSubstrings_BruteForce(String s) {
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

    public int countGoodSubstrings(String s) {

            int count=0,start=0,end=0;
            HashMap<Character,Integer> map = new HashMap<>();
            while(end<3){
                map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
                end++;
            }
            if(map.size()==3) count++;
            for(;end<s.length();end++){
                map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1); //next charcter
                //remove start character
                if(map.get(s.charAt(start))>1) map.put(s.charAt(start), map.get(s.charAt(start))-1);
                else map.remove(s.charAt(start));
                if(map.size()==3) count++;
                start++;

            }
            return count;
        }
}
