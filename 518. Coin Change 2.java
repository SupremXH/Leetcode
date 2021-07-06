class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        for(int i=1;i<n+1;i++){
            dp[i][0]=1;
            for(int j=1;j<amount+1;j++){
                dp[i][j]=dp[i-1][j]+(j>=coins[i-1]? dp[i][j-coins[i-1]] : 0);
            }
        }
        return dp[n][amount];
    }
}