package twopointer;

import java.util.Arrays;

public class ShortestDistanceToChar {

	public static void main(String[] args) {
		ShortestDistanceToChar obj = new ShortestDistanceToChar();
		int[] shortestToChar = obj.shortestToChar("lovetoleetcode", 'e');
		System.out.println(Arrays.toString(shortestToChar));

	}
	
    public int[] shortestToChar(String s, char c) {
        
        int leftD=0, rightD=0;
        int output[] = new int[s.length()];

        for(int i=0;i<s.length();i++){
          System.out.println("=>"+i);
          
             leftD = (s.lastIndexOf(c,i) == -1) ? s.indexOf(c,i) - i : i-s.lastIndexOf(c,i);
             rightD = (s.indexOf(c,i) == -1) ? i-s.lastIndexOf(c,i) : s.indexOf(c,i) - i;
             //System.out.println("left="+leftD+",Right"+rightD);

             output[i] = (leftD<rightD) ? leftD:rightD;



        }
        return output;
    }

}
