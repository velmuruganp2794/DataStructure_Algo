package HashMap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC_438_FindAllAnagarams_HashMap {

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


        return new ArrayList<>();
    }


}
