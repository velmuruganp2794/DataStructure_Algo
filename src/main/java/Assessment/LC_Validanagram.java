package Assessment;

import org.junit.Test;

import java.util.HashMap;

public class LC_Validanagram {

       /*Pseudo-code
    1. Declare two map
    2. Traverse string character and add it to map
    3. compare map, if equals return true
    4. else false.
    */

    @Test
    public void testdata1(){

        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));


    }

    @Test
    public void testdata2(){

        String s="rat";
        String t="car";
        System.out.println(isAnagram(s,t));


    }

    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
           tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
        }

        return smap.equals(tmap);

    }
}
