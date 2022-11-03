package HashMap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_1002_FindCommonChars {

     /* Pseudo code
    1. declare BaseHashMap and add first words character as key and count as value.
    2. Traverse remaining words in array
    3. Create temp map
    4. traverse each charcter in word and check character prresent in basemap
    5. If yes, add the charcter as key,  math.min(current char count , base map count)
    6. do the same for all the words in array
    7. traverse the final map and add the character with number of times in List
    */

    /* Time Complexity - O(n*m), Space Complexity - O(n) */

    @Test
    public void testdata1(){
       String[] words = {"bella","label","roller"};
       //Output: ["e","l","l"]
        System.out.println(commonChars(words));
    }

    @Test
    public void testdata2(){
        String[] words = {"cool","lock","cook"};
        //Output: ["c","o"]
        System.out.println(commonChars(words));
    }

    public List<String> commonChars(String[] words) {

        HashMap<String,Integer> basemap = new HashMap<>();

        //Base map for first word in String array
        for(int i=0;i<words[0].length();i++){
            char eachChar = words[0].charAt(i);
            basemap.put(String.valueOf(eachChar),basemap.getOrDefault(String.valueOf(eachChar),0)+1);
        }

        for(int i=1;i<words.length;i++) {
            HashMap<String , Integer> temp = tempCommonChar(words[i],basemap);
            basemap = temp;

        }
        //System.out.println(basemap);
        return convertHashmapToList(basemap);
    }

    public HashMap<String,Integer> tempCommonChar(String eachWord, HashMap<String, Integer> basemap){
        HashMap<String,Integer> tempMap = new HashMap<String,Integer>();

        for(int i=0;i<eachWord.length();i++){
            char eachChar = eachWord.charAt(i);
            if(basemap.containsKey(String.valueOf(eachChar))){

                int count = Math.min(tempMap.getOrDefault(String.valueOf(eachChar),0)+1, basemap.get(String.valueOf(eachChar)));
                tempMap.put(String.valueOf(eachChar),count);

            }
        }
        return tempMap;

    }

    public List<String> convertHashmapToList(HashMap<String,Integer> map){
        List<String> commonChars = new ArrayList<>();

        for(Map.Entry<String,Integer> entries:map.entrySet()){
            int value = entries.getValue();
            for(int i=0;i<value;i++){
                commonChars.add(entries.getKey());
            }

        }

        return commonChars;

    }
}