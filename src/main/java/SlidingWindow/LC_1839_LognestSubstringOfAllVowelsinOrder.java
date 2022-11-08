package SlidingWindow;

import org.junit.Test;

/* Pseudo code
1. declare vowelCount=1, lngth=1, maxCount=0;
2. Start from left and traverse each charcter in string
3. if previous character is same as next charcater increment length
4. If previous character is less than next character increment length and vowels count
5. else reset lngth=1, vowelCount=1
6. if vowelCount is equal to given k, find maximum b/w maxCount and lngth;
7. return maxCount;
 */

/* Time Complexity = O(n), Space Complexity - O(1) */

public class LC_1839_LognestSubstringOfAllVowelsinOrder {

    @Test
    public void testdata1(){
        String s="aeiaaioaaaaeiiiiouuuooaauuaeiu";
        //output = 13
        int output =  longestBeautifulSubstring(s);
        System.out.println(output);
    }

    @Test
    public void testdata2(){
        String s="aeeeiiiioooauuuaeiou";
        //output = 5
        int output =  longestBeautifulSubstring(s);
        System.out.println(output);
    }

    @Test
    public void testdata3(){
        String s="a";
        //output = 0
        int output =  longestBeautifulSubstring(s);
        System.out.println(output);
    }

    public int longestBeautifulSubstring(String word) {

        int lngth=1, vowelsCount=1, maxCount=0;
        char[] arr = word.toCharArray();

        for(int i=1;i<word.length();i++){

            if(arr[i-1]==arr[i]) lngth++;
            else if(arr[i-1]<arr[i]){
                lngth++;
                vowelsCount++;
            } else{
                lngth=1;
                vowelsCount=1;
            }

            if(vowelsCount==5) // 5 vowels count
                  maxCount =  Math.max(maxCount,lngth);
        }


    return maxCount;
    }
}
