package twopointer;

import java.util.Arrays;

import org.junit.Test;

public class LC_455_AssignCookies {

	/*
	 * ##Problem##: Each child i has a greed factor g[i], which is the minimum
	 * size of a cookie that the child will be content with each cookie j has a
	 * size s[j] If s[j] >= g[i], we can assign the cookie j to the child i, and
	 * the child i will be content Your goal is to maximize the number of your
	 * content children and output the maximum number.
	 * 
	 * 
	 * 1. Test data:
	 * 
	 * Positive:
	 * 
	 * g = [1,2,3], s = [1,1] Output: 1
	 * 
	 * Negative:
	 * 
	 * g = [2,3], s = [1] Output: 0
	 * 
	 * 
	 * Edge:
	 * 
	 * g = [10,9,8,7], s = [5,6,7] Output: 1
	 * 
	 * Pseudo code:
	 * 
	 * 1. Sort both the arrays, set count=0; 2. let gstart = zero th position of
	 * g[], sstart= zero th position of s[]. 3. If s[j] >= g[i], increment the
	 * count, gStart, sStart; 4. else increment sStart.
	 * 
	 * Complexity: Time Complexity = Space Complexity =
	 * 
	 */

	@Test
	public void positive() {

	}

	@Test
	public void negative() {

	}

	@Test
	public void edge() {

	}

	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);

		int count = 0, gStart = 0, sStart = 0;

		while (gStart < g.length && sStart < s.length) {

			if (g[gStart] <= s[sStart]) {
				count++;
				sStart++;
				gStart++;

			} else {
				sStart++;
			}

		}
		return count;

	}
}
