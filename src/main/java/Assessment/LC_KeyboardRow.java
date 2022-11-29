package Assessment;

import LinkedList_Implementation.LinkedList_impl;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class LC_KeyboardRow {

    /* Pseudo-code
    1. declare given words as 3 seperate string
    2. declare count variable for each string
    3. traverse each string and check if the character exist in given string
    4. if yes, increment that counter value
    5. at the end check string length matches with any of the count length
    6. if yes, add the string to list
    7. convert list to string array.

     */

    /*Time Complexity = O(N*M) , Space Complexity = O(N)*/


    @Test
    public void testdata1(){
        String[] words = {"Hello","Alaska","Dad","Peace"};
        //output =["Alaska","Dad"]
        String[] output = findWords(words);
        System.out.println(Arrays.toString(output));
    }

    @Test
    public void testdata2(){
        String[] words = {"omk"};
        //output =
        String[] output = findWords(words);
        System.out.println(Arrays.toString(output));
    }

    public String[] findWords(String[] words) {

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3= "zxcvbnm";

        LinkedList<String> output = new LinkedList<>();

        for(String word:words){
            int r1Count=0, r2Count=0, r3Count=0;
            for(char c:word.toLowerCase().toCharArray()){

                if(row1.indexOf(c)!=-1) r1Count++;
                else if(row2.indexOf(c)!=-1) r2Count++;
                else if(row3.indexOf(c)!=-1) r3Count++;
            }

            if(word.length()==r1Count || word.length()==r2Count || word.length()==r3Count){
                output.add(word);
            }

        }
        return output.toArray(new String[0]);

    }


}
