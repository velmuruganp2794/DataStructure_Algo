package HashMap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC_438_FindAllAnagarams_BruteForce {

     @Test
    public void testdata1(){
        String s = "cbaebabacd";
        String p = "abc";
         System.out.println(findAnagrams(s,p));
    }

    @Test
    public void testdata2(){
        String s = "abab";
        String p = "ab";
        System.out.println(findAnagrams(s,p));
    }

    public List<Integer> findAnagrams(String s, String p) {

      /* Pseudo code
      1. traverse the given s string
      2. find the substring of p string length
      3. check substring and p string for anagaram. if yes, add the index into output list
      4. re-set the string to substring from next index
      5. do thye same check till string length is >=3
      6. return output list.

      */

        int length = s.length();
        int plength = p.length();
        List<Integer> output = new ArrayList<>();

        for(int i=0;i<=length-plength;i++){
            String tempString = s.substring(0,plength);

            if(isAnagaram(tempString,p)) output.add(i);
            s=s.substring(1);


        }
        return output;

    }

    public boolean isAnagaram(String tempSubstring, String p){

        HashMap<Character,Integer> tsmap = new HashMap<>();
        HashMap<Character,Integer> pmap = new HashMap<>();

        for(int j=0;j<tempSubstring.length();j++){
            char c = tempSubstring.charAt(j);
            tsmap.put(c,tsmap.getOrDefault(c,0)+1);
        }

        for(int k=0;k<p.length();k++){
            char c = p.charAt(k);
            pmap.put(c,pmap.getOrDefault(c,0)+1);

        }

        if(tsmap.equals(pmap)) return true;

        else return false;
    }
}
