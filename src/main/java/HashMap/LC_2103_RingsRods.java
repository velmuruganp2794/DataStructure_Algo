package HashMap;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC_2103_RingsRods {

    /* Pseudo code
    1. Declare count =0. create hashMap.
    2. Traverse character in given strings starts from i=1 (rod), check if the char exist in hashmap
    3. if exist, get the set of value for that key, and add the (i-1)values to set.
    4. add the charcter and set to map
    5. if key not exist, create new set and add the rod as key , and values as  ring (i-1) to set
    6. Traverse the map, find number of set having size is 3.

     */

    @Test
    public void testdata1(){
        String rings = "B0R0G0R9R0B0G0";
        int rod = countPoints(rings);
        System.out.println(rod);
    }

    public int countPoints(String rings) { //"B0R0G0R9R0B0G0"

        int count = 0;
        HashMap<Character, Set<Character>> map = new HashMap<>();

        for(int i=1;i<rings.length();i+=2){

            char eachRod = rings.charAt(i);
            char ring = rings.charAt(i-1);

            if(!map.containsKey(eachRod)){
                HashSet<Character> set = new HashSet<>();
                set.add(ring);
                map.put(eachRod,set);


            } else {
                Set<Character> set1 =  map.get(eachRod);
                set1.add(ring);
                map.put(eachRod,set1);
            }


        }

        for(Map.Entry<Character,Set<Character>> entries : map.entrySet()){
            if(entries.getValue().size()==3) count++;
        }

  return count;
    }
}
