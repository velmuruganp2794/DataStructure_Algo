package timeComplexity;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class SumofAdjacentNumbersinArray {

	public static void main(String[] args) {
		SumofAdjacentNumbersinArray obj = new SumofAdjacentNumbersinArray();
		System.out.println(Arrays.toString(obj.sum((new int[] {1,2,3,4,5}))));
		

	}
	
	public int[] sum(int[] input){
		int[] output = new int[input.length-1];
		for(int i=0;i<input.length-1;i++){
			output[i]=input[i]+input[i+1];
			
		}
		
		return output;
	}

}
