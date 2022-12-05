package array;

import org.junit.Test;

import java.sql.SQLOutput;

public class LC_415_AddString {

    /*Pseudo-code
    1. Traverse each character from end in both the string
    2. add the digits and have carry as sum of digits/10, digit as digit%10, end--
    3. do the same till end >0 in both the strings
    4. find the digits of leftover and add with remaining carry
    5. convert the number into Strings
    */
    /* Time Complexity - O(M*N), Space Complexity = O(N) */
    @Test
    public void testdata1(){
        String num1="11";
        String num2 = "123";
        String output = addStrings(num1, num2);
        System.out.println(output);

    }

    @Test
    public void testdata2(){
        String num1="456";
        String num2 = "77";
        String output = addStrings(num1, num2);
        System.out.println(output);

    }

    public String addStrings(String num1, String num2) {

        int len1 = num1.length()-1; int len2 = num2.length()-1;
        StringBuilder result=new StringBuilder();
        int carry = 0;

        while(len1>=0 && len2>=0){

             int sum = num2.charAt(len2)-'0' + num1.charAt(len1)-'0' + carry;
             int digit = sum%10;
             carry = sum/10;
             result.insert(0,digit);
             len2--;
             len1--;
        }

        while(len1>=0){
            int sum = num1.charAt(len1)-'0' + carry;
            carry = sum/10;
            result.insert(0,sum%10);
            len1--;

        }

        while(len2>=0){
            int sum = num2.charAt(len2)-'0' + carry;
            carry = sum/10;
            result.insert(0,sum%10);
            len2--;
        }
        if(carry>0) result.insert(0,carry);


    return result.toString();
    }
}
