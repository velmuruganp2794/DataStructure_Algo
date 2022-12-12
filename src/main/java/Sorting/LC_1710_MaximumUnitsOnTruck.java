package Sorting;

import org.junit.Test;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;

public class LC_1710_MaximumUnitsOnTruck {

    /*Pseudo-code
    1. Sort the array using boxSizes. it. boxTypes[i][0];
    2. Add the boxUnits ie. boxTypes[][j] till the number of boxes reaches the trucksize
    3. return the maximum units.

     */

    @Test
    public void testdata1(){
        int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
        int truckSize = 10;
        int out = maximumUnits(boxTypes, truckSize);
        System.out.println(out);
    }

    @Test
    public void testdata2(){
        int[][] boxTypes = {{1,3},{2,2},{3,1}};
        int truckSize = 4;
        int out = maximumUnits(boxTypes, truckSize);
        System.out.println(out);
    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {

        //Comparator
        Arrays.sort(boxTypes, (i,j) -> Integer.compare(j[1], i[1]));

        System.out.println(Arrays.deepToString(boxTypes));
        int numberOfBox=0, numberOfUnit=0;
        int i=0;
        while(numberOfBox<truckSize && i<boxTypes.length) {
               numberOfBox = numberOfBox + boxTypes[i][0];
               numberOfUnit = numberOfUnit + (boxTypes[i][0] * boxTypes[i++][1]);

        }
        if(numberOfBox>truckSize){
            numberOfUnit = numberOfUnit - ((numberOfBox-truckSize) * boxTypes[i-1][1]);
        }
        return  numberOfUnit;
    }
}
