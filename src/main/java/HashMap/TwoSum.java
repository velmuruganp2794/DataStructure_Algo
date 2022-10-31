package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

import org.junit.Test;

public class TwoSum {
	/* Problem - Check sum of two elements which is equal to target available. return those two elements*/
	
	/* Pseudo Code: HashSet
	 1. Create hashSet
	 2. loop from array element and check target - array[i] present in set
	 3. if yes, return those element as array 
	 */
	
   /* Problem - Check sum of two elements which is equal to target available. return index of those two elements*/
	
	/* Pseudo Code: HashMap
	 1. Add all the values in array to hashmap as key and index as values.
	 2. loop from array element and check target - array[i] present in map and check the index not equal to target-array[i] key
	 3. if yes, return those index as array 
	 */
	
	@Test
	public void testdata1() {

		int input[] = { 1, 4, 2, 5, 6 };
		int target = 8;
		//int[] twoSum = twoSum_set(input, target);
		//System.out.println(Arrays.toString(twoSum));
		//int[] twoSum_returnInteger = twoSum_returnIndex(input, target);
		//System.out.println(Arrays.toString(twoSum_returnInteger));
		
		int[] twoSum_returnInteger = twoSum_returnValues(input, target);
		System.out.println(Arrays.toString(twoSum_returnInteger));
		
		

	}
	
	//@Test
	public void testdata2() {

		int input[] = { 2};
		int target = 4;
		int[] twoSum = twoSum_set(input, target);
		System.out.println(Arrays.toString(twoSum));
		

	}
	
	//@Test
	public void testdata3() {

		int input[] = {2,2};
		int target = 4;
		int[] twoSum = twoSum_set(input, target);
		System.out.println(Arrays.toString(twoSum));
		

	}
	
	
	
	public int[] twoSum_set(int[] nums, int target){
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<nums.length;i++){
			
			if(set.contains(target-nums[i])) return new int[] {nums[i],target-nums[i]};
			else set.add(nums[i]);
			
		}
		
		
		return new int[] {};
	}
	
    public int[] twoSum_returnIndex(int[] nums, int target){
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int[] output = new int[2];
		/* for(int eachnum=0;eachnum<nums.length;eachnum++){
	           
			 map.put(nums[eachnum], eachnum);     
	           
	       }*/
	         for(int eachnum1=0;eachnum1<nums.length;eachnum1++){
	           
	              if(map.containsKey(target-nums[eachnum1])){
	               output[0]=eachnum1;
	               output[1]= map.get(target-nums[eachnum1]);
	               
	               break;
	           } else {
	        	   map.put(nums[eachnum1], eachnum1);
	           }
		
		
		
	}
	         return output;

}
    
      public int[] twoSum_returnValues(int[] nums, int target){
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int[] output = new int[2];
		/*for(int eachnum=0;eachnum<nums.length;eachnum++){
	           
			 map.put(eachnum, nums[eachnum]);     
	           
	       }*/
	         for(int eachnum1=0;eachnum1<nums.length;eachnum1++){
	        	 
	           
	              if(map.containsValue(target-nums[eachnum1])){
	               output[0]= nums[eachnum1];
	               output[1]= target-nums[eachnum1];
	               
	               break;
	           } else {
	        	   map.put(eachnum1,nums[eachnum1]);
	           }
		
		
		
	}
	         return output;

}
  
	
}
    

