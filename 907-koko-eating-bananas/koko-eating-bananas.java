class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int b:piles){
            high=Math.max(high,b);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            long tothrs=0;
            for(int b:piles){
                tothrs+=(b+mid-1)/mid;
            }
            if(tothrs<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}