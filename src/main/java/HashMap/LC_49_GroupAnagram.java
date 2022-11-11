package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LC_49_GroupAnagram {

    /* Pseudo code:
   1. Declare HashMap String as key, List as value
   2. Traverse each string from array and convert it to char array
   3. sort the character array and check that whether present in Hashmap as key
   4. if no, create a list and add the string
   5. Add the string from string array as key and list as value
   6. if exist, fetch the list and add the value to existing list
   7. return List of map values.

   */

    /*Time Complexity = O(N*MlogM), Space Complexity - O(N) */

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){

            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String s1=String.valueOf(temp);

            if(!map.containsKey(s1)) map.put(s1,new ArrayList<>());
            map.get(s1).add(s);


        }
        //map.values will return collection

        return new ArrayList<>(map.values());
    }

    //Instead of Arrays.sort
    public List<List<String>> groupAnagrams_Ascii(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();
        int[] count = new int[26]; //26 lower case letters
        for(String s : strs){
            Arrays.fill(count,0);
            char[] temp = s.toCharArray();

            for(char c:temp) count[c-'a']++;
            StringBuilder sb = new StringBuilder("");
            for(int i=0;i<26;i++){ // creating like hashValues for each string
                sb.append("#");
                sb.append(count[i]);

            }

            String s1=sb.toString();

            if(!map.containsKey(s1)) map.put(s1,new ArrayList<>());
            map.get(s1).add(s);


        }
        //map.values will return collection

        return new ArrayList<>(map.values());
    }

}
