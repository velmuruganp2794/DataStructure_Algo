package SlidingWindow;

public class LC_1456_MaximumNumberOfVowelsinSubstring {

    /* Pseudo code:
   1. declare vowelcount=0, Maxvowels=0, start=0, end=0;
   2. traverse each char till given k and find vowels count.
   3. set Maxvowels = vowelcount;
   4. traverse next char and check whether vowel or not. if vowel , increment count;
   5. check the start char is vowel decrement count. ;
   6. increment start++;
   7. find maximum of current count, maxcount
   8. return maxCount;
   */
    /* Time complexity - O(n), Space Complexity = O(n); */

    public void testdata1(){
        String s="abciiidef";
        int k=3;
        //output = 3;
        int output = maxVowels(s,k);
        System.out.println(output);

    }
    public int maxVowels(String s, int k) {
        int start=0,end=0,vowelCount=0,MaxVowelCount=0;
        char[] arr = s.toCharArray();
        while(end<k){
            if(isVowel(arr[end])) vowelCount++;
            end++;

        }
        MaxVowelCount = vowelCount;
        while(end<s.length()){
            if(isVowel(arr[end])) vowelCount++;
            if(isVowel(arr[start])) vowelCount--;
            end++;
            start++;
            MaxVowelCount = Math.max(vowelCount,MaxVowelCount);
        }

        return MaxVowelCount;

    }
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
