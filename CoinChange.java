public class CoinChange {

    public static void main(String[] args) {
        int[] coins1 = {1,2, 5};
        int amount1 = 11;
        int res1 = coinChange(coins1,amount1);
        System.out.println(res1);
/*
        int[] coins2 = {2};
        int amount2 = 3;
        int res2 = coinChange(coins2,amount2);
        System.out.println(res2);

        int[] coins3 = {1};
        int amount3 = 0;
        int res3 = coinChange(coins3,amount3);
        System.out.println(res3);
*/
   }
    public static int coinChange(int[] coins, int amount) {

            // Edge case
            if (amount < 1) return 0;

            // DP array banao size = amount + 1
            int[] minCoinsDP = new int[amount + 1];

            // Har amount ke liye infinity se start karo
            for (int i = 1; i <= amount; i++) {
                minCoinsDP[i] = Integer.MAX_VALUE;

                // Har coin try karo
                for (int j = 0; j < coins.length; j++) {
                    int coin = coins[j];

                    if (coin <= i && minCoinsDP[i - coin] != Integer.MAX_VALUE) {
                        minCoinsDP[i] = Math.min(minCoinsDP[i], 1 + minCoinsDP[i - coin]);
                    }
                }
            }

            // Agar solution nahi mila
            if (minCoinsDP[amount] == Integer.MAX_VALUE) return -1;

            return minCoinsDP[amount];
        }
}

