package Assessment;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

public class LC_test {
    //Time - 4.23

    /*Pseudo-code
    1. Traverse each character in string add it to map till length < 3
    2. Declare count=0
    3. if set size is 3, increment count
    4. traverse charcter from index 3 in the string
    5. add one charcter right to set and remove left charcter from map if not exist. else reduce value 1
    6. if map size is 3, increment count
    7. do the same till <s.length
    8. at the end return count
     */

    @Test
    public void testdata1(){
        String s = "xyzzaz";
        int output = countGoodSubstrings(s);
        //Expected = 1
        System.out.println(output);
    }

    @Test
    public void testdata2(){
        String s = "xy";
        int output = countGoodSubstrings(s);
        //Expected =0
        System.out.println(output);
    }

    @Test
    public void testdata3(){
        String s = "aababcabc";
        //Expected = 4
        int output = countGoodSubstrings(s);
        System.out.println(output);
    }

    public int countGoodSubstrings(String s) {

        if(s.length()<3) return 0;

        int start=0, count=0;
        HashMap<Character,Integer> map = new HashMap<>();

        //first window
        for(int i=0;i<3;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        if(map.size()==3) count++;

        //slide the window
        for(int j=3;j<s.length();j++){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            if(map.get(s.charAt(start))>1)
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
            else map.remove(s.charAt(start));
            start++;
            if(map.size()==3) count++;
        }

        return count;

    }
}
