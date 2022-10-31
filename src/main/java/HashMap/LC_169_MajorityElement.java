package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class LC_169_MajorityElement {
	
	/*
    https://leetcode.com/problems/majority-element/
 */
 
 /* Pseudo Code: HashMap
 1. int max=Iteger.MIN_VALUE, maxKey;
 1. Traverse elements in array and add it into HashMap
 2. Traverse the keys in HashMap and compare the coressponding values with max.
 3. If the value is > max, re-assign the value as max, key as maxKey.
 4. Return maxKey
 */

 /* Time Complexity - O(n)
 Space Complexity - O(n)
 */
	
	@Test
	public void test(){
		int[] nums = {3,3,4};
		int majorityElement = majorityElement(nums);
		System.out.println(majorityElement);
		
		
	}
	public int majorityElement(int[] nums) {

	     int max=Integer.MIN_VALUE,maxkey = 0;
	     HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	     for(int num:nums) {
	       map.put(num,map.getOrDefault(num,0)+1);
	     }
	    
	     
	     System.out.println(map);

	    for(Entry<Integer, Integer> entry : map.entrySet()){
	    

	    if(entry.getValue() > max) {
	    	max=entry.getValue();
	    	maxkey = entry.getKey();
	    }


	    }
	   
	   return maxkey;
	     
	     
	 }

}
