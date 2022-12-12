package Sorting;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LC_56_MergeIntervals {
    /* Pseudo-code
    1. Sort the array based on 1st column value
    2. traverse from 1st array
    3. compare start with previous end . if it's less than update the end
    4. else put start and end to output list and update start and end with current array value
    5. return list as 2d array.
     */

    /* Time Complexity - O(N), Space Complexity - O(N) */


    @Test
    public void testdata(){
        int[][] intervals = {{1,3},{8,10},{2,6},{15,18}};
        int[][] output = merge(intervals);

        System.out.println(Arrays.deepToString(output));
    }

    @Test
    public void testdata1(){
        int[][] intervals = {{1,4},{0,4}};
        int[][] output = merge(intervals);

        System.out.println(Arrays.deepToString(output));
    }
    public int[][] merge(int[][] intervals) {

        //Comparator
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        int start=intervals[0][0];
        int end = intervals[0][1];
        ArrayList<int[]> list = new ArrayList<>();

        for(int i=1;i<intervals.length;i++){

            if(intervals[i][0]<=end){
                end = Math.max(end,intervals[i][1]);
            } else {
                list.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        list.add(new int[]{start,end});

    return list.toArray(new int[0][0]);
    }
}
