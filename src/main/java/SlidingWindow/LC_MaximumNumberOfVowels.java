package SlidingWindow;

import org.junit.Test;

public class LC_MaximumNumberOfVowels {
	
	/*Testdata:
		String s = workaattech;
          int k=3*/
	
	/*Pseudo code: Brute force
	1. set max=0, count=0
	2. traverse outer loop till < length
	3. traverse inner loop till <k
	4. check char is vowel.increment count
	5. after inner loop check math.max(max, count);
    6. return max*/
		
	@Test
	public void positive(){
		String s = "workaattech";
		int k=3;
		int maximumVowels = maximumVowels(s, k);
		System.out.println(maximumVowels);
		
	}
	
	public int maximumVowels(String s, int k){
		
		int max=0;
		
		for(int i=0;i<=s.length()-k;i++){
			System.out.println("i"+i);
			int count=0;
			for(int j=0;j<k;j++){
				
				if(s.charAt(i+j)=='a' || s.charAt(i+j)=='e' || s.charAt(i+j)=='i' 
						|| s.charAt(i+j)=='o' || s.charAt(i+j)=='u'){
					
					count++;
				}
				
				
			}
			max=Math.max(max,count);
			
		}
		
		return max;
	}
	
	public int maximumVowels_Sliding(String s, int k){
		
		return 0;
		
		
	}
	
	

}
