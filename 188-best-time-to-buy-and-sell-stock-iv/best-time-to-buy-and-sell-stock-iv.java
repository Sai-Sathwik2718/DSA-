class Solution {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        if(n==0) return 0;
        int[] buy=new int[k+1];
        int[] profit=new int[k+1];
        Arrays.fill(buy,Integer.MAX_VALUE);
        for(int price:prices){
            for(int t=1;t<=k;t++){
                buy[t]=Math.min(buy[t],price-profit[t-1]);
                profit[t]=Math.max(profit[t],price-buy[t]);
            }
        }
        return profit[k];
    }
}