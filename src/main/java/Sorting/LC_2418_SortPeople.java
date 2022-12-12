package Sorting;


import org.junit.Test;

import java.util.*;

public class LC_2418_SortPeople {

    /* Pseudo-code
    1. put heights and names as key and value in map
    2. Sort the heights array
    3. Traverse heights from length-1 and put it output String array

     */
    /*Time Complexity = O(NlogN), Space Complexity = O(N) */

    @Test
    public void testdata(){
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        String[] output = sortPeople(names, heights);
        System.out.println(Arrays.toString(output));
    }
    public String[] sortPeople(String[] names, int[] heights) {

        HashMap<Integer,String> map = new HashMap<>();
        String[] output = new String[names.length];
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int k=0;
        for(int j=heights.length-1;j>=0;j--){
            output[k++] = map.get(heights[j]);
        }
        return output;
    }

    /* Pseudo code
   1. Create Treemap and add heights and names in TreeMap as key and  value
   2. TreeMap will maintain order
   3. get the talest height and replace the corresponding name to replace in array's first position.
   4. do the same till all the elements in array
   5. return array
  */
    /* Time Complexity - O(n), Space Complexity - O(n) */

    public String[] sortPeople_Optimized(String[] names, int[] heights) {

        int j=0;
        TreeMap<Integer,String> map = new TreeMap<>(Collections.reverseOrder());

        for(int i=0;i<heights.length;i++)
            map.put(heights[i], names[i]);

        for(Map.Entry<Integer,String> eachEntry:map.entrySet())
            names[j++] = eachEntry.getValue();


        return names;

    }
}
