class Solution {
    public int commonFactors(int a, int b) {
        int g=gcd(a,b);
        int cnt=0;
        for(int i=1;i*i<=g;i++){
            if(g%i==0){
                cnt++;
                if(i!=g/i){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}