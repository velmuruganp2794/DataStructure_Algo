package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class LC_804_UniqueMorseCodeWords {

     /* Pseudo code:
     1. Add all the character and corresponding codes to map as key value
     2. declare string builder
     3. append code to stringBuilder for each char in words
     4. at the end add the transformation code to set
     5. return set size.

     Time Complexity - O(n*m) space Complexity - O(n)

    */

    /* Test data

    Input: words = ["gin","zen","gig","msg"]
Output: 2
Explanation: The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."
There are 2 different transformations: "--...-." and "--...--.".


    */

    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character,String> codemap = new HashMap<>();
        HashSet<String> set = new HashSet<String>();
        codemap.put('a',".-");
        codemap.put('b',"-...");
        codemap.put('c',"-.-.");
        codemap.put('d',"-..");
        codemap.put('e',".");
        codemap.put('f',"..-.");
        codemap.put('g',"--.");
        codemap.put('h',"....");
        codemap.put('i',"..");
        codemap.put('j',".---");
        codemap.put('k',"-.-");
        codemap.put('l',".-..");
        codemap.put('m',"--");
        codemap.put('n',"-.");
        codemap.put('o',"---");
        codemap.put('p',".--.");
        codemap.put('q',"--.-");
        codemap.put('r',".-.");
        codemap.put('s',"...");
        codemap.put('t',"-");
        codemap.put('u',"..-");
        codemap.put('v',"...-");
        codemap.put('w',".--");
        codemap.put('x',"-..-");
        codemap.put('y',"-.--");
        codemap.put('z',"--..");
        for(int i=0;i<words.length;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<words[i].length();j++){
                char temp = words[i].charAt(j);
                sb.append(codemap.get(temp));


            }
            set.add(sb.toString());





        }

        return set.size();
    }
}
