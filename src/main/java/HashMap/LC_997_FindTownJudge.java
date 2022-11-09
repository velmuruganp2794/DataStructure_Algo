package HashMap;

import java.util.HashMap;
import java.util.Map;

public class LC_997_FindTownJudge {
    /* Pseudo code
    1. Create two HashMap
    2. truested person as key and number of person trusted as value in trusted hashmap
    3. trustee Map, have trust[][j] as key;
    4. check trusted person from 1st map, not available in trustee map
    5. if yes, check number of person trusted. if n-1, return key
    6. else return -1
     */
    /* Time Complexity = O(n), Space Complexity = O(n) */

    public int findJudge(int n, int[][] trust) {

        if(n==1) return 1;
        HashMap<Integer,Integer> maptrusted = new HashMap<>();
        HashMap<Integer,Integer> maptrust2 = new HashMap<>();

        for(int i=0;i<trust.length;i++){
            maptrusted.put(trust[i][1],maptrusted.getOrDefault(trust[i][1], 0)+1);
            maptrust2.put(trust[i][0],trust[i][1]);
        }

        for(Map.Entry<Integer,Integer> entries:maptrusted.entrySet()) {
            if (!maptrust2.containsKey(entries.getKey()) && entries.getValue()==n-1)
                return entries.getKey();

        }
        return -1;
    }
}
