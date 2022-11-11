package HashMap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LC_500_KeyboardRow {
    /* Pseudo code - BruteForce
    1. Store the given row of strings into string array.
    2. iterate array and store each character in map with index of row
    3. Traverse each string in words array and find all the chars are available in single row
    4. if yes, add it to list
    5. do the same for all the word
    6. return list as String array.
    */

    /* Pseudo code = O(N*M) , Space Complexity = O(N) */

    @Test
    public void testdata1(){
        String[] words = {"Hello","Alaska","Dad","Peace"};
        //Output: ["Alaska","Dad"]
        System.out.println(Arrays.toString(findWords(words)));
    }

    @Test
    public void testdata2(){
        String[] words = {"omk"};
        //Output: []
        System.out.println(Arrays.toString(findWords(words)));
    }

    @Test
    public void testdata3(){
        String[] words = {"adsdf","sfd"};
        //Output: ["Alaska","Dad"]
        System.out.println(Arrays.toString(findWords(words)));
    }

    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        // Store char, row index in Map
        HashMap<Character,Integer> baseRow = new HashMap<>();
        for(int i=0;i< rows.length;i++)
            for(char c:rows[i].toCharArray()) baseRow.put(c,i);

        // Iterate words and check all are placed in single row
        ArrayList<String> outputlist = new ArrayList<>();

        for(String word : words){ // n words
            boolean singlerow = true; // boolean flag to check
            int row = baseRow.get(word.toLowerCase().charAt(0));

            for(char c:word.toLowerCase().toCharArray()){ // m length
                if(baseRow.get(c)!=row){
                    singlerow=false;
                    break;
                }
            }

            if(singlerow) outputlist.add(word);



        }

        return outputlist.toArray(new String[outputlist.size()]);


    }

    //Using Counter
    /* Pseudo code
    1. declare 3 strings with given row of characters
    2. declare 3 count.
    3. increment the respective count if char of word present in row of string
    4. check if any count length matches with word length
    5. if yes, add to output list.
    6. Return list as String.

     */

    public String[] findWords_UsingCounts(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        ArrayList<String> outputList = new ArrayList<>();
        for(String word:words){
            int count1=0, count2=0, count3=0;
            for(char c:word.toLowerCase().toCharArray()){

                if(row1.indexOf(c)!=-1) count1++;
                if(row2.indexOf(c)!=-1) count2++;
                if(row3.indexOf(c)!=-1) count3++;

            }

            if(count1==word.length() || count2==word.length() || count3==word.length())
                outputList.add(word);


        }
        return outputList.toArray(new String[0]);
    }

}
