package HashMap;

import org.junit.Test;

import java.util.HashMap;

public class LC_13_RomanToIntegr {

    @Test
    public void testdata1(){
        String s = "III";
        int output = romanToInt(s);
        // Output: 3
    }

    @Test
    public void testdata2(){
        String s = "LVIII";
        int output = romanToInt(s);
        // Output: 3
    }

    @Test
    public void testdata3(){
        String s = "MCMXCIV";
        int output = romanToInt(s);
        // Output: 3
    }


    public int romanToInt(String s) {

        int sum=0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for(int i=0;i<s.length()-1;i++){

            if(map.get(s.charAt(i))<map.get(s.charAt(i+1)))
                sum -=map.get(s.charAt(i));
            else
                sum +=map.get(s.charAt(i));
        }

        return sum+map.get(s.charAt(s.length()-1));


    }
}
