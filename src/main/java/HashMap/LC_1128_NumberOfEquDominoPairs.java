package HashMap;

import org.junit.Test;

import java.util.HashMap;

public class LC_1128_NumberOfEquDominoPairs {

    /* Pseudo Code
    1. Traverse dominoes array and find the minimum and maximum in each domino pair
    2. add min*10+max as key to hashmap, number of occurrence as value
    3. when the value is greater than 1, find the count of pair by n*n-1/2
    4. add the pair count with previous count
    5. return pair count.

     */

    /* Time complexity = O(n), Space Complexity = O(n) */

    @Test
    public void testdata1(){

        int[][] dominoes = {{1,2},{2,1},{3,4},{5,6}};
        int output = numEquivDominoPairs(dominoes);
        System.out.println(output);
    }

     @Test
    public void testdata2(){
        int[][] dominoes = {{1,2},{1,2},{1,1},{1,2},{2,2}};
        int output = numEquivDominoPairs(dominoes);
        System.out.println(output);

    }

    public int numEquivDominoPairs(int[][] dominoes) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int countOfPairs=0;

        for(int[] domino:dominoes){

            int num = Math.min(domino[0],domino[1]) * 10 + Math.max(domino[0],domino[1]);
            map.put(num,map.getOrDefault(num,0)+1);

        }

        for(int eachKey:map.keySet()){
            int n=map.get(eachKey);
            if(n>1) countOfPairs +=(n*(n-1)/2);
        }
        return countOfPairs;
    }
}
