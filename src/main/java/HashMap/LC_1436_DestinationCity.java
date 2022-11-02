package HashMap;

import org.junit.Test;

import java.util.*;

public class LC_1436_DestinationCity {

     /* Pseudo code:
    1. declare Hashmap for source city
    2. Traverse the list and get each list and add source to source map
    3. Traverse the list and get each list and check the destination is available in the map.
    4. if the destination is not available return that.
    */

    /* Time Complexity - O(n), Space Complexity - O(n)
     */

    @Test
    public void testdata1(){
        List<List<String>> paths = new ArrayList<List<String>>();
        paths.add(Arrays.asList("London","New York"));
        paths.add(Arrays.asList("New York","Lima"));
        paths.add(Arrays.asList("Lima","Sao Paulo"));
        String destination = destCity_Usingmap(paths);
        System.out.println("using map :"+destination);
        String destination2 = destCity_Usingmap_withoutContains(paths);
        System.out.println("using map without Contains method:"+destination);
        String destination1 = destCity_UsingSet(paths);
        System.out.println("Using Set :"+destination1);

    }

    @Test
    public void testdata2(){
        List<List<String>> paths = new ArrayList<List<String>>();
        paths.add(Arrays.asList(new String[] {"B","C"}));
        paths.add(Arrays.asList(new String[] {"D","B"}));
        paths.add(Arrays.asList(new String[] {"C","A"}));
        String destination = destCity_Usingmap(paths);
        System.out.println("using map :"+destination);
        String destination1 = destCity_UsingSet(paths);
        System.out.println("Using Set :"+destination1);

    }

    public String destCity_Usingmap(List<List<String>> paths) {
        HashMap<String,String> source = new HashMap<>();
       for(List<String> eachlist:paths){
           source.put(eachlist.get(0),"");
       }
       for(List<String> eachlist:paths){
           if(!source.containsKey(eachlist.get(1))) return eachlist.get(1);
       }

      return "not possible";
    }

    public String destCity_Usingmap_withoutContains(List<List<String>> paths) {
        HashMap<String,String> source = new HashMap<>();
        for(List<String> eachlist:paths){
            source.put(eachlist.get(0),"");
        }
        for(List<String> eachlist:paths){
            if(source.get(eachlist.get(1))==null) return eachlist.get(1);
        }

        return "not possible";
    }

    public String destCity_UsingSet(List<List<String>> paths) {
        HashSet<String> source = new HashSet<>();
        for(List<String> eachlist:paths){
            source.add(eachlist.get(0));
        }
        for(List<String> eachlist:paths){
            if(!source.contains(eachlist.get(1))) return eachlist.get(1);
        }

        return "not possible";
    }
}
