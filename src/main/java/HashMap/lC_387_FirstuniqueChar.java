package HashMap;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class lC_387_FirstuniqueChar {
     /*
     Pseudo code
    1. declare index=-1;
    1. Add all the char to map
    2. traverse the map
    3. return the key which has value 1

    */
    /*Time complexity - O(n), Space Complexity = O(n) */

    @Test
    public void testdata1(){
        String s = "leetcode";
        firstUniqChar(s);
        //Output: 0
    }

    @Test
    public void testdata2(){
        String s = "loveleetcode";
        firstUniqChar(s);
        //Output: 2
    }

    @Test
    public void testdata3(){
        String s = "aabb";
        firstUniqChar(s);
        //Output: -1
    }

    public int firstUniqChar(String s) {

        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        int index=-1;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                index=i;
                break;
            }
        }


        return index;
    }
}
