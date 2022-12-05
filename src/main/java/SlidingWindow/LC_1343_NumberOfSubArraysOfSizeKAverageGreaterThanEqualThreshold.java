package SlidingWindow;

public class LC_1343_NumberOfSubArraysOfSizeKAverageGreaterThanEqualThreshold {

    /* Pseudo-Code
    1. Declare count=0, double sum=0, Avg;
    2. Find the average for the first window with k length
    3. check if the avg is equal or greater than threshold. if yes increase counter
    4. add right value to sum and minus the left value from sum and find the avg
    5. if avg is greater than threshold, increase the count
    6. do the same till less than array length
     */

    /*Time Complexity = O(N), Space Complexity = O(1) */

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        if(arr.length<k) return 0;

        int count=0;
        double sum=0,avg;

        for(int i=0;i<k;i++){
            sum = sum+arr[i];

        }
        avg = sum/k;
        if(avg>=threshold) count++;

        for(int j=k;j<arr.length;j++){
            sum = sum+arr[j]-arr[j-k];
            avg = sum/k;
            if(avg>=threshold) count++;
        }
          return count;
    }


}
