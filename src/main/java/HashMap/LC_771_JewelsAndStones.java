package HashMap;

import org.junit.Test;

import java.util.HashMap;

public class LC_771_JewelsAndStones {

    /* Pseudo code;
   1. declare count as zero.
   2. Add each stones to map as key and value pair
   3. Traverse jewels and check each char is available in map.
   4. if yes, add the values to count.
   5. return count.

   Time complexity = O(n), Space Complexity = O(1);

   */

    @Test
    public void testdata1(){
        String jewels = "aA";
        String stones = "aAAbbbb";
        numJewelsInStones(jewels,stones);
        //Output: 3
    }

    @Test
    public void testdata2(){
        String jewels = "z";
        String stones = "ZZ";
        numJewelsInStones(jewels,stones);
        //Output:0
    }
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char c;

        HashMap<Character, Integer> stoneMap = new HashMap<>();
        for(int i=0;i<stones.length();i++){
            c = stones.charAt(i);
            stoneMap.put(c,stoneMap.getOrDefault(c,0)+1);
        }

        for(int j=0;j<jewels.length();j++){
            c = jewels.charAt(j);
            if(stoneMap.containsKey(c)) count = count + stoneMap.get(c);
        }
        return count;
    }
}
