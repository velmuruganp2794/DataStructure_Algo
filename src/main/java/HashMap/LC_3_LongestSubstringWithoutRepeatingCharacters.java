package HashMap;

import org.junit.Test;

import java.util.HashSet;

public class LC_3_LongestSubstringWithoutRepeatingCharacters {

    @Test
    public void testdata1(){

        //String s = "abcabcbb";
        String s = "tmmzuxt";
        //output = 3;
        System.out.println(lengthOfLongestSubstring(s));

    }

    @Test
    public void testdata2(){

        String s = "bbbbb";
        //output = 1;
        System.out.println(lengthOfLongestSubstring(s));

    }

    @Test
    public void testdata3(){

        String s = "pwwkew";
        //output = 3;
        System.out.println(lengthOfLongestSubstring(s));

    }

    public int lengthOfLongestSubstring(String s) {
        /* Pseudo code
        1. declare HashSet
        2. use two pointer start, end = 0
        3. if set not contains charcter add to set and increment end and if contains break
        4. find maxlenth = end-start;
        5. use for loop for next window
        6. remove the previous character till set not contains current character, else move start pointer+1
        7. do thye same till end<length
        8. return count;
        */

        int start=0,end;
        int maxCount=0;
        HashSet<Character> set = new HashSet<>();
        for(end=0;end<s.length();end++){
            if(set.contains(s.charAt(end))) break;
            else {
                set.add(s.charAt(end));
            }

        }
        maxCount = Math.max(maxCount, end-start);

        for(int j=end;j<s.length();j++){

            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(j));
            maxCount = Math.max(maxCount,j-start+1);

        }

return maxCount;
    }
}
