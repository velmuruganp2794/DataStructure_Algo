package HashMap;

import org.junit.Test;

import java.util.HashMap;

public class LC_1748_SumOfUniqueElements {

    /* Pseudo code
    1. Traverse add elements and add to hashmap if not exist
    2. If exist, increase the value+1
    3. traverse map and add the keys which having value 1
    4. return sum.
    */
    /* Time Complexity = O(N), Space Complexity - O(N) */

    @Test
    public void testdata1(){
        int[] nums = {1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }

    @Test
    public void testdata2(){
        int[] nums = {1,1,1,1,1};
        System.out.println(sumOfUnique(nums));

    }

    @Test
    public void testdata3(){
        int[] nums = {1,2,3,4,5};
        System.out.println(sumOfUnique(nums));
    }
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;

        for(int i=0;i<nums.length;i++)
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        for(int eachkey:map.keySet())
            if(map.get(eachkey)==1) sum +=eachkey;

        return sum;

    }
}
