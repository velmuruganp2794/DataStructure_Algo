package array;

public class sortArrayByParity11 {

	public static void main(String[] args) {
		
		sortArrayByParity obj = new sortArrayByParity();
		obj.sortArrayByParity(new int[] {4,2,5,7});

	}
	
	public int[] sortArrayByParity(int[] nums) {

	       int[] output = new int[nums.length];
	         int Even=0;
	         int odd=1;
	       
	        for(int i=0;i<nums.length;i++){
	          
	          if((nums[i]%2)==0 || nums[i]==0){
	        	  
	              output[Even]=nums[i];
	              Even=Even+2;
	              
	          } else{
	              output[odd]=nums[i];
	              odd = odd+2;
	              
	          }
              
	        }
	        return output;
	        
	    }

}
