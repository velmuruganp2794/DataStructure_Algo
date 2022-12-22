package HashMap;

import org.junit.Test;

import java.io.CharConversionException;
import java.util.*;
import java.util.stream.Stream;

public class LC_1207_UniqueNumberOfOccurance {
    /*
    Pseudo-code
    1. Put in the map with occurance as value
    2. sort the values
    3. compare ith position with i-1, if matches return false
    4. end return true;
     */

    @Test
    public void testdata1(){
        int[] arr = new int[] {1,2,2,1,1,3};
        boolean out = uniqueOccurrences(arr);
        System.out.println(out);
    }

    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int arr1:arr){
            map.put(arr1,map.getOrDefault(arr1,0)+1);
        }

        Object[] objects = map.values().toArray();
        Arrays.sort(objects);

      for (int i=1;i<objects.length;i++){
          if(objects[i]==objects[i-1]) return false;
      }


        return true;
    }


}
