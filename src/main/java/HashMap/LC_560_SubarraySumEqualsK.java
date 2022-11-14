package HashMap;

import org.junit.Test;

import java.util.HashMap;

public class LC_560_SubarraySumEqualsK {
    /* Pseudo code
    1. use prefix sum concept
    2. by default add 0,1 in HashMap
    3. Traverse each element in array and find subarray sum
    4. check sum minus k exist in Map, if yes add frequency to count and remove the key
    5. do the same for all the elements in array
    6. return count;
     */


    @Test
    public void testdata1() {
        int[] nums = {1, -1, 0};
        int k = 0;


    }

    @Test
    public void testdata2() {
        int[] nums = {1, 2, 3};
        int k = 3;

    }

    @Test
    public void testdata3() {
        int[] nums = {1, 1, 1};
        int k = 2;

    }

    public int subarraySum(int[] nums, int k) {
        int start = 0, count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        //PrefixSum - By default add 0
        map.put(0, 1);


        for (int end = 0; end < nums.length; end++) {
            sum = sum + nums[end];

            if (map.containsKey(sum - k)) {
                count = count + map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }

        return count;


    }

}
