package twopointer;

import org.junit.Test;

public class LC_121_BestTimetobyandSellStock {

    @Test
    public void testdata1(){
        int[] input = new int[]{7,1,5,3,6,4};
        //output = 5
        System.out.println(maxProfit(input));
    }

    public int maxProfit(int[] prices) {

        int min = prices[0], maxProfit = 0;

        for(int i=1;i<prices.length;i++){

            if(min<prices[i]){
                maxProfit = Math.max(maxProfit,prices[i]-min);
            } else {
                min = prices[i];
            }
        }
        return maxProfit;



    }
}
