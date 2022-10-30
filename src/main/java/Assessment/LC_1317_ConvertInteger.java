package Assessment;

public class LC_1317_ConvertInteger {
	
	/* Test data:

    Example1:
    Input - 2
    Output = 1

    Example2:
    Input = 11
    Output = 2,9

    Example3:
    Input = 111
    Output - 12,99
     
     */

     /* Pseudo code: Brute Force
     1. Declare int array with size 2
     2. Loop through i=1 till i<n
     3. reduce the number - i and check 0 present in (i) and (number-i)
     4. if present increment i
     5. else output[0] =i, output[1]=num-i;
     6. return output
     */

     /*Time Complexity = O(n), Space complexity = O(1)*/
public int[] getNoZeroIntegers(int n) {

        int[] output = new int[2];

       for(int i=1;i<n;i++){ // 4102
           int temp = n-i;

           if(!String.valueOf(temp).contains("0") && !String.valueOf(i).contains("0")) {
               output[0] = i;
               output[1] = n-i;
               break;
           }


       }
       
       return output;
    }    

// Optimize
    public int[] getNoZeroIntegers_WithoutStrings(int n) {

        int[] output = new int[2];
		return output;

      

    
    
	

}
    
}
