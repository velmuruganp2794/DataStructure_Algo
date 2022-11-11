package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LC_888_FairCandySwap {

    /* Pseudo code - BruteForce
   1. Traverse alice array and add each element to HashMap1 as value and index as value. Also find the sum.
   2. Traverse bob array and add each element to HashMap2 as value and index as value. Also find sum
   3. Find the avg of both alice and bob
   4. find each element in alice array, check each element+diff available in HashMap
   5. If yes, return alice array element and element+diff;
   */
    /* Time Complexity = O(M+N), Space Complexity = O(N) */
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal=0, bobTotal=0;
        HashMap<Integer,Integer> bobMap = new HashMap<>();
        HashMap<Integer,Integer> aliceMap = new HashMap<>();
        for(int i=0;i<aliceSizes.length;i++){
            aliceTotal +=aliceSizes[i];
            aliceMap.put(i,aliceSizes[i]);
        }

        for(int j=0;j<bobSizes.length;j++){
            bobTotal += bobSizes[j];
            bobMap.put(j,bobSizes[j]);

        }
        int aliceDiff = (aliceTotal+bobTotal)/2 - aliceTotal;
        for(Map.Entry<Integer,Integer> entry:aliceMap.entrySet()){

            if(bobMap.containsValue(entry.getValue()+aliceDiff))
                return new int[]{entry.getValue(),entry.getValue()+aliceDiff};
        }

        return new int[]{};
    }

    /* Pseudo code
    1. traverse alice & bob array and add each element as key.
    2. find alice sum and bob sum. find diff = average of sum;
    3. check key in aliceMap + diff exist in bobMap
    4. retun as array.

     */

    public int[] fairCandySwap_Optimized(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal=0, bobTotal=0;
        HashSet<Integer> bobSet = new HashSet<>();
        HashSet<Integer> aliceSet = new HashSet<>();
        for(int i : aliceSizes){
            aliceTotal +=aliceSizes[i];
            aliceSet.add(aliceSizes[i]);
        }

        for(int j : bobSizes){
            bobTotal += bobSizes[j];
            bobSet.add(bobSizes[j]);

        }
        int aliceDiff = (aliceTotal+bobTotal)/2 - aliceTotal;
        for(int set: aliceSet){

            if(bobSet.contains(set+aliceDiff))
                return new int[]{set,set+aliceDiff};

        }


        return new int[]{};
    }
}
