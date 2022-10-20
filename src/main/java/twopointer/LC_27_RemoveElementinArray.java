package twopointer;

public class LC_27_RemoveElementinArray {

	public static void main(String[] args) {
		
		LC_27_RemoveElementinArray obj = new LC_27_RemoveElementinArray();
		obj.removeElement(new int[] {3,2,2,3}, 3);
		

	}
	
	public int removeElement(int[] nums, int val) {
	      int start = 0, end=nums.length-1, count=0;

	      if(nums.length==0) return 0;
	      if(nums.length==1 && nums[0]==val) return count;
	      
	        while(start < end){
	            System.out.println(start+ ", end"+end);
	           if(nums[start]==val && nums[end]!=val ){

	               int temp=nums[start];
	               nums[start] = nums[end];
	               nums[end]=temp;
	           }

	           if(nums[start]!=val) start++;
	           
	           if(nums[end]==val){
	               nums[end]=0;
	               end--;
	               count++;

	           }
	           

	        }
	        if(nums[start]==val && start==end) count++;
	        return nums.length-count;
	        
	    }

}
