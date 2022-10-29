package Assessment;

public class LC_167_twoSum {
	
	 /* Test data;
    Example1:
    input = [2,7,11,15]; target = 9
    output = [1,2];

    Example2:
    input = [2,3,4], target = 6
    output = [1,3]

    Example3:
    input= [-1,0]; target = -1
    output = [1,2]

    

    /* Pseudo code:
    1. declare output int array
    2. use two for loops i=0, j=i+1
    3. check the sum of nums[i]+nums[j]
    4. if sum matches target , return output array with i and j index


    */
    /* Time complexity = O(n^2), Space Complexity = O(1); */

    /* Pseudo code - Two pointers
    1. let start=0, end=length-1, sum=0
    2. while(start<end) check the sum of start+end
    3. If sum< target, increment start++
    4. If sum> target, decrement end--
    5. if sum matches target
    6. return output array with start+1, end+1;

    */
    /* Time complexity = O(n), Space Complexity = O(1); */

    
   /* public int[] twoSum(int[] numbers, int target) {

        int[] output = new int[2];
        int sum=0;
        for(int i=0;i<numbers.length;i++){

            for(int j=i+1;j<numbers.length;j++){
                sum = numbers[i]+numbers[j];
                if(sum==target){
                    output[0] = i+1; // index starts at 0. 
                    output[1] = j+1;
                    break; 
                }
            }
        }
return output;
    } */

    public int[] twoSum(int[] numbers, int target) {

        int start=0, end=numbers.length-1, sum=0;
        int output[] = new int[2];

        while(start<end){
           sum = numbers[start]+numbers[end];

           
          if(sum<target) start++;
           if(sum>target) end--;
        
           if(sum==target){
                 
                 output[0]=start+1;
                 output[1]=end+1;
                 break;
           }


        }
          
          return output;
    }


}
