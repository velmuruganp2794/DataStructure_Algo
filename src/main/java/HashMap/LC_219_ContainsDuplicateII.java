package HashMap;

import org.junit.Test;

import java.util.HashMap;

public class LC_219_ContainsDuplicateII {

    /* Pseudo-code: BruteForce
    1. two for loops
    2. Outer loop from i=0 to length-1
    3. inner loop from j=i+1 to length-1
    4. Check nums[i]==nums[j] && math.abs(i-j)
    5. if yes, return true.
    6. At the end return false;
    */

    /* Time Complexity - O(n^2), Space Complexity = O(1); */

    /* Pseudo-code: Hashmap
    1. Declare HashMap
    2. Traverse input array and check each element present in Hashmap
    3. If not add array element as key and index as value;
    4. if yes, check Math.abs(existing key index - current key index) <= k
    6 if condition matches return true
    7. At the end return false;

    */

    /* Time Complexity - O(n), Space Complexity = O(1); */

    @Test
    public void testdata1() {
        int[] nums = {1, 2, 3, 1};
        int k=3;
        System.out.println(containsNearbyDuplicate(nums,k));
        //Output: true
    }

    @Test
    public void testdata2() {
        int[] nums = {1, 0, 1, 1};
        int k=1;
        System.out.println(containsNearbyDuplicate(nums,k));
        //Output: true
    }

    @Test
    public void testdata3() {
        int[] nums = {1,2,3,1,2,3};
        int k=2;
        System.out.println(containsNearbyDuplicate(nums,k));
        //Output: false
    }

    public boolean containsNearbyDuplicate_BruteForce(int[] nums, int k) {

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                if(nums[i]==nums[j] && Math.abs(i-j)<=k) return true;

            }
        }
        return false;

    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i])-i) <= k) return true;
           map.put(nums[i],i);

        }
        return false;

    }
}
