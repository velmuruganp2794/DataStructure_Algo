package HashMap;

import org.junit.Test;

import java.util.HashSet;

public class LC_929_UniqueEmailAddress {

    /* Pseudo code - BruteForce
   1. declare set. Iterate each Email
   2. Split the email using @ and verify the localname
   3. check Localname contains +. if yes, get a substring of name before + character.
   4. remove all the dots in localname.
   5 validEmail is localname+@+domainname
   6. add the valid email in set
   7. Return the size of Set
   */

    /* Time Complexity - O(n), Space complexity - (1) */

    @Test
    public void testdata1(){

        String[] emails = {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};
        int uniqueEmailSize = numUniqueEmails(emails);
        System.out.println(uniqueEmailSize);
    }
    public int numUniqueEmails(String[] emails) {
        HashSet<String> validEmail = new HashSet<>();

        for(String eachEmail:emails){
            int index = eachEmail.indexOf("@");
            String Localname = eachEmail.substring(0,index);
            int indexPlus = Localname.indexOf("+");
            if(indexPlus>0) Localname = Localname.substring(0,Localname.indexOf("+"));
            Localname = Localname.replaceAll("\\.","");

            validEmail.add(Localname+"@"+eachEmail.substring(index));

        }

        return validEmail.size();
    }


}
