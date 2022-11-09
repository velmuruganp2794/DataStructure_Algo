package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LC_859_BuddyStrings {

    /* Pseudo-code
    1. If s.length not equal to goal.length , return false;
    2. if s equals to goal, check for duplicates.
    3. if no duplicates, return false, else true.
    4. add mismatching index to list.
    5. if size = 2 and list first index position of s string matches with goal string second index, vice versa
    6. if condition matches return true, else false.

   */
    /* Time Complexity = O(n), Space Complexity - O(n) */
    public boolean buddyStrings(String s, String goal) {

        //length mis-match
        if (s.length() != goal.length()) return false;

        //Equal string
        if(s.equals(goal)){
            HashSet<Character> set = new HashSet<>();
            for(char c:s.toCharArray())
                set.add(c);

            return set.size()<s.length();
        }
        //not equal String
        int[] arr = new int[2];
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=goal.charAt(i)){
                if(count==2) return false;
                  arr[count++]=i;
            }

        }
        if(s.charAt(arr[0])==goal.charAt(arr[1]) && s.charAt(arr[1])==goal.charAt(arr[0])) return true;

        return false;

    }
    /*
    1. When both the strings are equal, we need to find duplicate in s string.
    2. create int array with size 26
    3. char[each char - 'a']++;
    4. traverse the string, check if arr[s.charAt(i)] > 1, return true. else false;

     */
    /* space complexity will be reduced to O(1) */

    public boolean buddyStrings_optimized(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); ++i)
                count[s.charAt(i) - 'a']++;

            for (int c: count)
                if (c > 1) return true;
            return false;
        } else {
            int first = -1, second = -1;
            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (first == -1)
                        first = i;
                    else if (second == -1)
                        second = i;
                    else
                        return false;
                }
            }

            return (second != -1 && s.charAt(first) == goal.charAt(second) &&
                    s.charAt(second) == goal.charAt(first));
        }
    }
}
