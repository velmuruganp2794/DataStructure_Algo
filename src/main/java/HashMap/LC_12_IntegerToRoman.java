package HashMap;

import org.junit.Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LC_12_IntegerToRoman {
    /*Pseudo-code
    1. Put all the given 1,4,5,9,10,40,50,90,100,400,500,900,1000 as key, corresponding roman in Map
    2. Iterate the map and check if the given number is greater than key  add the given value of key to String
    3. then minus the value from given number and do the same
    4. return final string.
     */

    @Test
    public void testdata(){
        int num=3;
        String out = intToRoman(num);
        System.out.println(out);
    }

    @Test
    public void testdata1(){
        int num=76;
        String out = intToRoman(num);
        System.out.println(out);
    }

    @Test
    public void testdata2(){
        int num=3890;
        String out = intToRoman(num);
        System.out.println(out);
    }

    @Test
    public void testdata3(){
        int num=1999;
        String out = intToRoman(num);
        System.out.println(out);
    }

    public String intToRoman(int num) {

        TreeMap<Integer,String> map = new TreeMap<>((a,b)->b-a);
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");

        StringBuilder out = new StringBuilder();
        for(Map.Entry<Integer,String> entry:map.entrySet()){

            while(num>=entry.getKey()){
                out.append(entry.getValue());
                num = num - entry.getKey();
            }
            if(num==0) break;
        }
        return out.toString();
    }

    public String intToRoman_(int num) {
        String roman;
        String I[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String X[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String C[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String M[] = {"","M","MM","MMM"};




        roman =  M[num/1000]  + C[(num%1000)/100] +  X[(num%100)/10] +   I[num%10];
        return roman;



    }
}
