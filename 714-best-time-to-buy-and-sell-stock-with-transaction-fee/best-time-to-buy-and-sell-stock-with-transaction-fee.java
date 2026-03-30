class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int[][] dp=new int[n+2][2];
        dp[n][0]=0;
        dp[n][1]=0;
        dp[n+1][0]=0;
        dp[n+1][1]=0;
        for(int i=n-1;i>=0;i--){
            for(int hold=1;hold>=0;hold--){
                int ans=Integer.MIN_VALUE;
                if(hold==0){
                    int buy=dp[i+1][1]-prices[i];
                    int notbuy=dp[i+1][hold];
                    ans=Math.max(ans,Math.max(buy,notbuy));
                }else{
                    int sell=prices[i]+dp[i+1][0]-fee;
                    int notsell=dp[i+1][hold];
                    ans=Math.max(ans,Math.max(sell,notsell));
                }
                dp[i][hold]=ans;
            }
        }
        return dp[0][0];
    }
}