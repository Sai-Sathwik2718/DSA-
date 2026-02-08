class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] prefix=new int[n+1];
        Arrays.fill(prefix,0);
        for(int i=1;i<=n;i++){
            prefix[i]=gain[i-1]+prefix[i-1];
        }
        int maxi=Integer.MIN_VALUE;
        for(int x:prefix){
            if(x>maxi){
                maxi=x;
            }
        }
        return maxi;
        
    }
}