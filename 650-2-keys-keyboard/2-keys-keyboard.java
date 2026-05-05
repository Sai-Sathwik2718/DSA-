class Solution {
    public int minSteps(int n) {
        int c=0;
        while(n%2==0){
            c+=2;
            n/=2;
        }
        // if(c>0) return 2;
        for(int i=3;(i*i)<=n;i+=2){
        
            while(n%i==0){
                c+=i;
                n/=i;
            }
            // if(c>0) return 1;
        }
        if(n>1) c+=n;
        return c;
    }
}