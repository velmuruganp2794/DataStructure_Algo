package array;

import org.junit.Assert;
import org.junit.Test;

public class twoSum {

	public void postive() {

		int input[] = { 1, 4, 2, 5, 6 };
		int target = 8;
		findTwoSum(input, target);

	}

	@Test
	public void negative() {

		int input[] = { 1 };
		int target = 8;

	}

	@Test
	public void edge() {

		int input[] = { 1, 3, 6, 5, 2 };
		int target = 8;
		findTwoSum(input, target);
	}

	public int[] findTwoSum(int input[], int target) {

		int output[] = new int[2];

		if (input.length < 2)
			return new int[] {};

		for (int i = 0; i < input.length; i++) {

			for (int j = i + 1; j < input.length; j++) {

				if ((input[i] + input[j]) == target) {
					return new int[] { i, j }; // First Match

					// Last Match

					/*
					 * output[0] = i; output[1] = j;
					 */
				}

			}

		}
		return output;
	}

}
