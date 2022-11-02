package HashMap;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LC_1512_GoodpairsInArray {

     /* Pseudo code - Brute Force
    1. declare int count=0;
    2. use two for loops. outer for loops starts from 0th to length-1
    3. inner for loops starts from i+1 to length-1
    4. check nums[i]==nums[j], increment counter
    5. return count.
    */

    /* Time complexity = O(n^2), Space complexity = O(1) */

     /* Pseudo code - Optimization using Hashmap
    1. declare int count=0;
    2. Add the element in array in hashmap as key and 1 as value.
    3. Increment the value if the key already present.
    4. Iterate the values in map and find good pairs by n*n-1/2; n= value in Map
    5. Add the good pairs with count
    6. Return Count
    */

    /* Time Complexity = , Space Complexity = */

    @Test
    public void testdata1(){
        int[] nums = {4,4,2,2};
        int pairCount = numIdenticalPairsI(nums);
        System.out.println(pairCount);
    }



    @Test
    public void testdata3(){
        int[] nums = {1,2,3,4};
        int pairCount = numIdenticalPairsI(nums);
        System.out.println(pairCount);
    }



    public int numIdenticalPairs_BruteForce(int[] nums) {

        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) count++;
            }
        }
        return count;

    }

    public int numIdenticalPairs(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int n= entry.getValue();
            count = count+ (n*(n-1))/2;
        }


        return count;
    }

    public int numIdenticalPairsI(int[] nums) {
        int count=0, occurance=0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            occurance = map.getOrDefault(nums[i],0);
            count = count + occurance;
            map.put(nums[i],occurance+1);
        }




        return count;
    }
}
