package SlidingWindow;

import org.junit.Test;

/*
 * Problem:
	You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', 
	representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.

	You are also given an integer k, which is the desired number of consecutive black blocks.

	In one operation, you can recolor a white block such that it becomes a black block.

	Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.

*/

/*
  Testdata:
	Example 1:

		Input: blocks = "WBBWWBBWBW", k = 7
		Output: 3
		Explanation:
		One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
		so that blocks = "BBBBBBBWBW". 
		It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
		Therefore, we return 3.
		Example 2:

		Input: blocks = "WBWBBBW", k = 2
		Output: 0
		Explanation:
		No changes need to be made, since 2 consecutive black blocks already exist.
		Therefore, we return 0.
		*/

/* Pseudo code:
1. Set count as 0, pointer=0, minimum=0;
2. Traverse char in String(pointer<k) and check if char is 'W'. (one slid)
3. If Yes, counter++. 
4. At end of loop, assign minmum = count;
4. traverse the other elements for next sliding till String.length()
5. Check if the left char is W, count--; (Shrink)
6. Check if the right char is W, count++;(Grow) pointer++;
7. compare count vs minimum. if(count<minimum, reassign count as minimum)
7. Return minimum;


*/

/*Time Complexity: O(n)
Space Complexity: O(1)*/
public class LC_2379_MinimumRecolors {
	
	@Test
	public void example2(){
		String s ="WBWBBBW";
		minimumRecolors(s, 2);
	}
	
	 public int minimumRecolors(String blocks, int k) {

	        int pointer=0, count=0,minRecolor=0;
	        while(pointer < k){
	           if( blocks.charAt(pointer)=='W') count++;
	           pointer++;
	        }
	        minRecolor=count;

	        while(pointer<blocks.length()){ //"WBWBBBW"

	           if(blocks.charAt(pointer-k) =='W') count--; //Shrinking left
	           if(blocks.charAt(pointer)=='W') count++; // Growing right
	           minRecolor = Math.min(minRecolor,count);
	           pointer++;

	        }

	        return minRecolor;
	        
	    }

}
