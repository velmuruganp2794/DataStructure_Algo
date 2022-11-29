package LinkedList_Stack_Problems;

import org.junit.Test;

import java.util.LinkedList;

public class LC_844_BackspaceStringCompare {
    /* Pseudo code
    1. traverse each character and add to list if the character is not "#"
    2. if the charcter is # and not empty, remove last charcter from list
    3. do the same for both the list
    4. compare the list, if equal return true.
    5. else false;
     */

    @Test
    public void testdata(){
        String s = "ab##";
        String t="c#d#";
        backspaceCompare(s,t);

    }

    @Test
    public void testdata2(){
        String s = "ab#c";
        String t="ad#c";
        backspaceCompare(s,t);

    }

    @Test
    public void testdata3(){
        String s = "a#c";
        String t="b";
        backspaceCompare(s,t);

    }

    public boolean backspaceCompare(String s, String t) {

        LinkedList<Character> slist = new LinkedList<>();
        LinkedList<Character> tlist = new LinkedList<>();

        for(char c:s.toCharArray()){
            if(c=='#' && slist.size()>0) slist.removeLast();
            else if(c!='#') slist.add(c);

        }

        for(char c:t.toCharArray()){
            if(c=='#' && tlist.size()>0 ) tlist.removeLast();
            else if(c!='#') tlist.add(c);
        }

        return slist.equals(tlist);


    }
}
