class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return func(0,-1,nums,dp);
    }
    public int func(int i,int prevind,int[] arr,int[][] dp){
        if(i==arr.length){
            
                return 0;
        }

        
        if(dp[i][prevind+1]!=-1){
            return dp[i][prevind+1];
        }
        int nottake=func(i+1,prevind,arr,dp);
        int take=0;
        if(prevind==-1  || arr[i]>arr[prevind]){
            take=func(i+1,i,arr,dp)+1;
        }
        
        return dp[i][prevind+1]=Math.max(take,nottake);
    }

}