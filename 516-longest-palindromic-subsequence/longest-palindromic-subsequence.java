class Solution {
    public int longestPalindromeSubseq(String s) {
        String t=new StringBuilder(s).reverse().toString();
        return func(s,t);
    }
    public static int func(String s,String t){
        int n=s.length();
        int m=t.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=m;i++){
            dp[0][i]=0;
        }
        for(int idx=1;idx<=n;idx++){
            for(int idx2=1;idx2<=m;idx2++){
                if(s.charAt(idx-1)==t.charAt(idx2-1)){
                    dp[idx][idx2]=1+dp[idx-1][idx2-1];
                }else{
                    dp[idx][idx2]=Math.max(dp[idx-1][idx2],dp[idx][idx2-1]);
                }
            }
        }
        return dp[n][m];
    }
}