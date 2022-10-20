package twopointer;

import java.util.HashSet;

public class LC_1346_CheckNandItsDoubleExist {

	/*
	 * Problem: Given an array arr of integers, check if there exist two indices
	 * i and j such that : i != j 0 <= i, j < arr.length arr[i] == 2 * arr[j]
	 * 
	 * Test data:
	 * 
	 * Positive:
	 * 
	 * arr = [10, 2, 5, 3] output: true
	 * 
	 * Negative:
	 * 
	 * arr = [3,1,7,11] output: false
	 * 
	 * Edge :
	 * 
	 * arr = [-16, -8, 0, 1, 4] output = true
	 * 
	 * arr = [0, 0] output = true
	 * 
	 * Pseudo Code: 
	 * 
	 * Approach 1: Brute force
	 *  1. use two for loops with i=0 and j=1+1
	 *  2. traverse each(i) element in array and compare with (i+1) element
	 *  3. if(i * 2 = i+1 element or i= 2 * i+1) return true.
	 *  4. Return false after loop. 
	 *
	 * Approach 2: Hashset
	 * 1. traverse elements in array
	 * 2. check if the (element * 2) or (element/2 && element%2==0) exist in set.
	 * 3. if no, add the element in hashset.
	 * 4. if yes, return true.
	 * 5. outer loop return false.
	 * 
	 * 
	 *
	 *
	 *
	 *
	 *
	 */
	
	
	//Approach 1. Time complexity = O(n^2), Space complexity = O(n)
   public boolean checkIfExist_BruteForce(int[] arr) {
        
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                 if(arr[i]==2*arr[j] || arr[j]==2*arr[i]) return true;

            }
        }
        return false;
    }
   
 //Approach 2. Time complexity = O(n^2), Space complexity = O(n)
   public boolean checkIfExist_hashSet(int[] arr) {
       
       HashSet<Integer> set = new HashSet<Integer>();
       for(int i=0;i<arr.length;i++){
         if(set.contains(2*arr[i]) || (set.contains(arr[i]/2) && arr[i]%2==0)) return true;
         else set.add(arr[i]);
           
       }
       return false;
   }

}
