package HashMap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_438_FindAllAnagarams_HashMap {

     @Test
    public void testdata1(){
        String s = "cbaebabacd";

        String p = "abc";
        //Output: [0,6]
        //System.out.println(findAnagrams(s,p));
        System.out.println(findAnagrams_(s,p));
    }

    @Test
    public void testdata2(){
        String s = "abab";
        String p = "ab";
        System.out.println(findAnagrams(s,p));
    }



      /* Pseudo code
     1. Add the p string character to pMap
     2. traverse s string add characters to sMap till size less than pLength
     3. compare two map. if equals add 0 to list
     4. then add one charcater from right side to map
     5. remove character from left, if value of the key is 1. else remove value
     6. compare the map , if matches add pointer - p string length+1 to map
     7. do the same till pointer less than length
     8. return list
      */


        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> list = new ArrayList<>();
            if(s.length()<p.length())return list;
            Map<Character, Integer> pMap = new HashMap<>();
            for (char c : p.toCharArray()) {
                pMap.put(c, pMap.getOrDefault(c, 0) + 1);
            }

            char c;
            Map<Character, Integer> sMap = new HashMap<>();
            for (int i = 0; i < p.length(); i++) {
                c=s.charAt(i);
                sMap.put(c, sMap.getOrDefault(c, 0) + 1);
            }
            if (pMap.equals(sMap)) list.add(0);

            for (int i = p.length(); i < s.length(); i++) {
                c = s.charAt(i);
                sMap.put(c, sMap.getOrDefault(c, 0) + 1);
                char key = s.charAt(i - p.length());
                if (sMap.get(key) == 1)
                    sMap.remove(key);
                else
                    sMap.put(key, sMap.get(key) - 1);
                if (pMap.equals(sMap)) list.add(i - p.length() + 1);
            }
            return list;
        }

    /* Pseudo code
 1. Add p-string into HashMap
 2. Traverse s-string to HashMap till  the p-string length
 3. Compare both the hashMap, if equal add index to list
 4. add one chracter right side to Map
 5. Remove one character from left from Map
 6. Compare the map, if same add the index to list.
 7. return list;

 */
    public List<Integer> findAnagrams_(String s, String p) {

        if(s.length() < p.length()) return new ArrayList<>();
        int start=0;
        HashMap<Character,Integer> pMap = new HashMap<>();
        HashMap<Character,Integer> sMap = new HashMap<>();
        ArrayList<Integer> indicies = new ArrayList<>();

        for(char c:p.toCharArray()) pMap.put(c,pMap.getOrDefault(c,0)+1);

        for(int i=0;i<p.length();i++){
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
        }

        if(pMap.equals(sMap)) indicies.add(0);

        for(int j=p.length();j<s.length();j++){
            sMap.put(s.charAt(j),sMap.getOrDefault(s.charAt(j),0)+1);
            if(sMap.get(s.charAt(start))==1){
                sMap.remove(s.charAt(start));
                start++;
            } else {
                sMap.put(s.charAt(start),sMap.get(s.charAt(start))-1);
                start++;
            }
            if(pMap.equals(sMap)) indicies.add(start);

        }

        return indicies;
    }


}
