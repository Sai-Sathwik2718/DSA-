class Solution {
    public static int cnt=1;
    public int countNumbersWithUniqueDigits(int n) {
        // if(n==0){
        //     return 1;
        // }
        return 1+backtrack(0,n,0);
        
    }
    public static int backtrack(int len,int n,int mask){
        if(len==n){
            return 0;
        }
        int cnt=0;
        for(int digit=0;digit<=9;digit++){
            if(len==0 && digit==0){
                continue;
            }
            if((mask&(1<<digit))!=0){
                continue;
            }
            
            cnt+=1;
            cnt+=backtrack(len+1,n,mask|(1<<digit));
        }
        return cnt;
    }
}