public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices)); // 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices2)); // 0

        int[] prices3 = {2, 4, 1};
        System.out.println(maxProfit(prices3)); // 2
    }
    public static int maxProfit(int[] prices) {
    /*   int tempSum = -1;
	    int maxSum = 0;

	    for(int i=0;i<prices.length;i++){
	        for(int j=i+1;j<prices.length;j++){
	            if(prices[i]<prices[j]){
	                tempSum = Math.abs(prices[i]-prices[j]);
	                if(maxSum<tempSum){
	                    maxSum = tempSum;
	                }
	            }
	        }
	    }
	    return maxSum;
    }*/
        int tempSum = 0;
        int maxSum = 0;
        int minPrice = prices[0]; // track min as you go

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];              // found cheaper buy price
            } else {
                tempSum = prices[i] - minPrice;    // profit if sold today
                if (tempSum > maxSum) {
                    maxSum = tempSum;              // update best profit
                }
            }
        }

        return maxSum;
    }
}
