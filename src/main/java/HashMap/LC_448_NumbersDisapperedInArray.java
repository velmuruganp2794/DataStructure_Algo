package HashMap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LC_448_NumbersDisapperedInArray {

    /* Brute Force
    1. Add all the arrays elements into HashSet
    2. declare output list
    3. use loop from j=1 to j<=n
    4. if i not contains in set, add it to list
    5. Return list.
    */

    /* Time complexity - O(n), Space Complexity - O(n) */

    @Test
    public void testdata1(){
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));

        //Output: [5,6]
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>();
        for(int j=1;j<=nums.length;j++){
            if(!set.contains(j)) list.add(j);
        }
        return list;
    }

}
