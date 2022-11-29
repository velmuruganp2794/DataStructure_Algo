package Assessment;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

public class LC_jewelsAndStons {

    /*
    1. traverse stones character and add it to map
    2. traverse jewels chacrter and check if stone contains that character
    3. if yes add the occurance with output count
    4. do the same for all the character in map
    5. return output count;
     */
    @Test
    public void testdata1(){
        String jewels = "aA", stones = "aAAbbbb";
       int output =  numJewelsInStones(jewels,stones);
        System.out.println(output);

    }

    @Test
    public void testdata2(){
        String jewels = "z", stones = "ZZ";
        int output = numJewelsInStones(jewels,stones);
        System.out.println(output);

    }

    public int numJewelsInStones(String jewels, String stones) {

        int count=0;

        HashMap<Character,Integer> map = new HashMap<>();


       for (char c:stones.toCharArray()){
           map.put(c,map.getOrDefault(c,0)+1);
       }

       for(char c:jewels.toCharArray()){
           if(map.containsKey(c)) count = count+map.get(c);
       }

       return  count;

    }

    public int numJewelsInStones_Ascii(String jewels, String stones) {

        int count =0;

        return 0;

    }
}
