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
        for(int ind1=1;ind1<=n;ind1++){
            for(int ind2=1;ind2<=m;ind2++){
                if(s.charAt(ind1-1)==t.charAt(ind2-1)){
                    dp[ind1][ind2]=1+dp[ind1-1][ind2-1];
                }else{
                    dp[ind1][ind2]=Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
                }

                
            }
        }
        return dp[n][m];
    }
    public int minInsertions(String s) {
        return s.length()-longestPalindromeSubseq(s);
    }
}