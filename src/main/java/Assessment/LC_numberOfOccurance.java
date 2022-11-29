package Assessment;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LC_numberOfOccurance {

    @Test
    public void testdata(){
        String s="aaabbccaad";
        //output =  "a3b2c2a2d1";
        String output = occurance(s);
        System.out.println(output);
    }

    public String occurance(String s) {
        int start=0, end=1;

        StringBuilder sb = new StringBuilder();

        while(start<s.length() && end<s.length()-1){

            if(s.charAt(start)!=s.charAt(end)){
                sb.append(s.charAt(start));
                sb.append(end-start);
                start=end;
                end++;

            }
            if(s.charAt(start)==s.charAt(end)) end++;
        }

      return sb.toString();
    }
}
