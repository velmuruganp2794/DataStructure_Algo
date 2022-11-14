package HashMap;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

public class LC_567_PermutationInString {

    /*
    1. Check if s1 length is greater than s2. if yes, false
    2. add all the characters of s1 to s1Map
    3. add the s2 length of characters till s1 length to s2map
    4. compare both the map, if equals return true.
    5. else, traverse from s1.length , add one charcter from right.
    6. if the left frequency is 1, remove left. else reduce value 1
    7. do the map compare
    8. return true if map equals.

    */
    /*Time Complexity = O(N), Space Complexity = O(N) */

    @Test
    public void testdata1(){

        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion_Ascii(s1,s2));
        //true

    }

    @Test
    public void testdata2(){

        String s1 = "ab";
        String s2 = "eidboaoo";
        System.out.println(checkInclusion_Ascii(s1,s2));
        //false

    }
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length()) return false;
        int start=0, end=0;
        HashMap<Character,Integer> s1Map = new HashMap<>();
        HashMap<Character,Integer> s2Map = new HashMap<>();


        while(end<s1.length()){
            s2Map.put(s1.charAt(end),s1Map.getOrDefault(s1.charAt(end),0)+1);
            s2Map.put(s2.charAt(end),s2Map.getOrDefault(s2.charAt(end),0)+1);
            end++;
        }

        if(s1Map.equals(s2Map)) return true;

        while(end<s2.length()){

            s2Map.put(s2.charAt(end),s2Map.getOrDefault(s2.charAt(end),0)+1);
            if(s2Map.get(s2.charAt(start))==1) s2Map.remove(s2.charAt(start));
            else s2Map.put(s2.charAt(start),s2Map.get(s2.charAt(start))-1);
            if(s1Map.equals(s2Map))return true;
            end++;
            start++;


        }
        return false;

    }


    public boolean checkInclusion_Ascii(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int start=0, end=0;
        int[] s1Array = new int[26];
        int[] s2Array = new int[26];

        while(end<s1.length()){
            s1Array[s1.charAt(end)-'a']++;
            s2Array[s2.charAt(end)-'a']++;
            end++;
        }
        if(Arrays.equals(s1Array,s2Array)) return true;

        while(end<s2.length()){
            s2Array[s2.charAt(end)-'a']++;
            s2Array[s2.charAt(start)-'a']--;
            if(Arrays.equals(s1Array,s2Array)) return true;
            end++;
            start++;

        }

        return false;
    }
}
