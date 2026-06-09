import  java.util.*;
public class MaxProfit {


    public static void main(String[] args) {
// Test Case 1: Normal case with profit opportunity
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Test 1: prices = " + Arrays.toString(prices1));
        System.out.println("Output: " + maxProfit(prices1));
        System.out.println("Expected: 5 (buy at 1, sell at 6)\n");
    }
    public static int maxProfit(int[] prices) {
        int maxPr = 0;
        int profit = 0;

        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++) {
                if (prices[i] < prices[j]) {
                    profit = Math.abs(prices[i] - prices[j]);
                    maxPr = Math.max(profit, maxPr);
                }
            }
        }
        return maxPr;
    }
}