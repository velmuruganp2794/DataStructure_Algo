package HashMap;

import org.junit.Test;


import java.util.HashMap;

public class LC_205_IsomorphicStrings {


    /*Psedo code:
        1. Declare HashMap
        2. use for loop to traverse character in s string
        3. Check if charcter in sString is available in hashMap
        4. if yes, check the value of that key equal to tString
        5. if yes, continue else return false
        6. If character in sString is not available , check the tstring char present in hashmap
        7. if yes, return false
        8. else add sstring char, tString char to map;
        9. return true at the end;

        */

    /* Time complexity - O(n), SpaceComplexity - O(n) */

    @Test
    public void testdata1(){
        String input1 = "foo", input2 = "bar";
        boolean output= isIsomorphic(input1,input2);
        System.out.println(output);
    }

    @Test
    public void testdata2(){
        String input1 = "bbbaaaba", input2 = "aaabbbba";
        boolean output= isIsomorphic(input1,input2);
        System.out.println(output);
    }

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> map = new HashMap<Character,Character>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))==t.charAt(i)) continue;
                else return false;

            } else {

                if(map.containsValue(t.charAt(i))) return false;
                else map.put(s.charAt(i),t.charAt(i));


            }



        }
        return true;

    }
}
