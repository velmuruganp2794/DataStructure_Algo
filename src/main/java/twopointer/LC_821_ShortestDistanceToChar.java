package twopointer;

import java.util.Arrays;

public class LC_821_ShortestDistanceToChar {

	public static void main(String[] args) {
		LC_821_ShortestDistanceToChar obj = new LC_821_ShortestDistanceToChar();
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

    public int[] shortestToChar_optimized(String s, char c) {
        int output[] = new int[s.length()];

        int right,left;

        for(int i=0;i<s.length();i++){

            left=i;
            right=i;
            int distance = Integer.MAX_VALUE;

            while(left>=0){

                if(s.charAt(left)==c) {
                      distance = Math.min(distance,Math.abs(i-left));
                      break;
                }
                left--;

            }

            while(right<=s.length()-1){

                if(s.charAt(right)==c) {
                    distance = Math.min(distance,Math.abs(i-right));
                    break;
                }
                right++;
            }
            output[i] = distance;


        }





        return output;
    }

}
