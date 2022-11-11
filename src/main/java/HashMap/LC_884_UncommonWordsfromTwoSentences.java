package HashMap;

import org.junit.Test;

import java.util.*;

public class LC_884_UncommonWordsfromTwoSentences {

    /* Pseudo code
    1. convert string into string array after split using regex for both the strings
    2. add all the words to to hashmap
    3. Traverse all the words in Hashmap and find key with value equal to 1.
    4. add those keys and convert as string array;
    */

    /* Time Complexity = O(M+N), SpaceComplexity = O(M+N) */

    @Test
    public void testdata1(){

        String s1 = "this apple is sweet", s2 = "this apple is sour";
        //Output: ["sweet","sour"]
        //System.out.println(Arrays.toString(uncommonFromSentences(s1,s2)));
        System.out.println(Arrays.toString(uncommonFromSentences_optimized(s1,s2)));

    }


    @Test
    public void testdata2(){

       String s1 = "apple apple", s2 = "banana";
        //Output: ["banana"]
        System.out.println(Arrays.toString(uncommonFromSentences(s1,s2)));

    }
    public String[] uncommonFromSentences(String s1, String s2) {

        String[] s1Array = s1.split("\\W");
        String[] s2Array = s2.split("\\W");
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        for(int i=0;i<s1Array.length;i++)
            map.put(s1Array[i],map.getOrDefault(s1Array[i],0)+1);


        for(int i=0;i<s2Array.length;i++)
            map.put(s2Array[i],map.getOrDefault(s2Array[i],0)+1);

        HashSet<String> set = new HashSet<>();
        /*for(Map.Entry<String,Integer> entry:map.entrySet())
            if(entry.getValue()==1) set.add(entry.getKey());
        String[] output = new String[set.size()];
        System.arraycopy(set.toArray(),0,output,0,set.size());*/

        for(String eachKey: map.keySet())
            if(map.get(eachKey)==1) set.add(eachKey);


        return set.toArray(new String[0]);

    }
    /*Single fo loop to add words from two string arrays */

    public String[] uncommonFromSentences_optimized(String A, String B) {
        Map<String, Integer> count = new HashMap<>();
        for (String w : (A + " " + B).split(" "))
            count.put(w, count.getOrDefault(w, 0) + 1);
        ArrayList<String> res = new ArrayList<>();
        for (String w : count.keySet())
            if (count.get(w) == 1)
                res.add(w);
        return res.toArray(new String[0]);
    }
}
