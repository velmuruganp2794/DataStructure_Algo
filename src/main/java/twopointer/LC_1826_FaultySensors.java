package twopointer;

import org.junit.Test;

public class LC_1826_FaultySensors {
	
	/*
	  Test data:
		
		Positive: 
			int[] sensor1={2,3,4,5};
		    int[] sensor2={2,1,3,4};
		    Output= 1
		    		
		Negative:
			int[] sensor1={2,2,2,2,2};
		    int[] sensor2={2,2,2,2,5};
		    Output = -1
		    		
		 Edge:   
			 int[] sensor1={2,3,2,2,3,2};
			int[] sensor2={2,3,2,3,2,7};
			output = 2
			
		*/
	
	/*
	  Pseudo code:
		1. index=0, length=sensor.length;
        2. traverse both the arrays and check if(sensor1[index]==sensor2[index])
        3. If yes, index = index+1
        4. If no, check ( index==length-1 ) return -1
        5. traverse elements from index and check 	if(sensor1[index]==sensor2[index+1]
        6. if(index==length-1) ? 1: 2;		
        */
	
	/*Time Complexity: O(n)
	Space Complexity : O(n)*/
		
		
	
	@Test
	public void positive(){
		int[] sensor1={2,3,4,5};
		int[] sensor2={2,1,3,4};
		System.out.println(badSensor(sensor1,sensor2));
		
	}
	
	@Test
	public void negative(){
		int[] sensor1={2,2,2,2,2};
		int[] sensor2={2,2,2,2,5};
		System.out.println(badSensor(sensor1,sensor2));
		
		
	}
	
	@Test
	public void Edge(){
		int[] sensor1={2,3,2,2,3,2};
		int[] sensor2={2,3,2,3,2,7};
		System.out.println(badSensor(sensor1,sensor2));
	}
	
	public int badSensor(int[] sensor1, int[] sensor2) {
        int length = sensor1.length;
        int index = 0;
        while (index < length && sensor1[index] == sensor2[index])
            index++;
        if (index >= length - 1)
            return -1;
        while (index < length - 1 && sensor1[index] == sensor2[index + 1])
            index++;
        if(index==length-1) return 1;
        else return 2;		
    }
	
	
	
	
	

}
