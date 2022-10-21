package twopointer;

import org.junit.Test;

import preparation.test;

public class LC_832_FlipImage {

	/*
	 * Problem: Given an n x n binary matrix image, flip the image horizontally,
	 * then invert it, and return the resulting image.
	 * 
	 * To flip an image horizontally means that each row of the image is
	 * reversed.
	 * 
	 * For example, flipping [1,1,0] horizontally results in [0,1,1]. To invert
	 * an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
	 * 
	 * For example, inverting [0,1,1] results in [1,0,0].
	 */

	/*
	 * Testdata:
	 * 
	 * Positive: Input = [[1,1,0],[1,0,1],[0,0,0]] Output:
	 * [[1,0,0],[0,1,0],[1,1,1]]
	 * 
	 * 
	 * Input = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]] Output:
	 * [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]
	 */

	/*
	 * Pseudo Code: 
	 * 1. Traverse each row in N*N matrix; 
	 * 2. Consider row as 1D array 
	 * 3. use two pointer start=0, end=N-1 for column in each row 
	 * 4. swap the numbers in each row till start < end 
	 * 5. traverse the array again and check the value 
	 * 6. If the value is 1 set it as 0, else set it as 1 
	 * 7. return array.
	 */

	/*
	 * Complexity: Time complexity = O(n2) Space complexity = O(n)
	 */

	@Test
	public void test(String[] args) {

		int[][] image = { { 1, 1, 0, 0 }, { 0, 1, 1, 0 }, { 1, 0, 0, 0 }, { 0, 1, 0, 1 } };
		flipAndInvertImage(image);

	}

	public int[][] flipAndInvertImage(int[][] image) {

		int row, column;
		row = column = image.length;

		// reverse values in row.
		for (int i = 0; i < row; i++) {
			int start = 0, end = row - 1;

			while (start < end) {
				int temp = image[i][start];
				image[i][start] = image[i][end];
				image[i][end] = temp;
				start++;
				end--;
			}

		}

		// revert the values 1 as 0 and 0 as 1 in the array

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {
				image[i][j] = (image[i][j] == 0) ? 1 : 0;
			}
		}

		return image;

	}

}
