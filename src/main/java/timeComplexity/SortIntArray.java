package timeComplexity;

import java.util.Arrays;

public class SortIntArray {

	public static void main(String[] args) {
		
		SortIntArray obj = new SortIntArray();
		//int[] sortArray = obj.sortArray(new int[] {90, 23, 5, 109, 12, 22, 67, 34});
		int[] sortArray = obj.sortArray(new int[] {}); /* Empty Array */
		//int[] sortArray = obj.sortArray(new int[] {90}); /* Single element in Array */
		System.out.println(Arrays.toString(sortArray));

	}
	
	public int[] sortArray(int[] input){
		
		
			for(int i=0;i<input.length;i++){
				
				for(int j=i+1;j<input.length;j++){
					
					if(input[i]>input[j]){
						int temp=input[i];
						input[i]=input[j];
						input[j]=temp;
					}
				}
			}
		
		return input;
		
		
	}

}
