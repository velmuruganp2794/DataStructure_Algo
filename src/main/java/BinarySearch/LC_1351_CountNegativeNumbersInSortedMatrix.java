package BinarySearch;

import org.junit.Test;

public class LC_1351_CountNegativeNumbersInSortedMatrix {
    /*
    Pseudo-code = BruteForce
    1. Iterate each element and increase count if element is less than zero
    2. return the count
     */

    /* Time Complexity = O(N*M), Space Complexity = O(N) */

    @Test
    public void testdata1(){
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int out = countNegatives(grid);
        System.out.println(out);
    }

    @Test
    public void testdata2(){
        int[][] grid = {{3,2},{1,0}};
        int out = countNegatives(grid);
        System.out.println(out);
    }

    public int countNegatives(int[][] grid) {

        int row = grid.length;
        int column = grid[0].length;
        int count=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(grid[i][j]<0) count++;
            }
        }

     return count;
    }
}
