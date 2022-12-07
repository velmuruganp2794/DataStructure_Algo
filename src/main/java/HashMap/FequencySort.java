package HashMap;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FequencySort {

    @Test
    public void sortbyfrequency(){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(5,4);
        map.put(3,2);
        map.put(1,0);
        map.put(2,1);
        map.put(8,1);
        map.put(7,9);
        map.put(6,0);
        System.out.println(map);

       LinkedHashMap<Integer,Integer> map1 = map.entrySet().stream()
               .sorted(Map.Entry.comparingByValue())
               .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldvalue,newValue) -> oldvalue, LinkedHashMap::new));

        System.out.println(map1);
    }

    @Test
    public void SortbyKey(){

        TreeMap<Integer,Integer> map = new TreeMap<>();
        map.put(5,4);
        map.put(3,2);
        map.put(1,0);
        map.put(2,1);
        System.out.println(map);

    }
}
