class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int b:weights){
            low=Math.max(low,b);
        }
        for(int j:weights){
            high+=j;
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            int curload=0;
            int reqdays=1;
            for(int b:weights){
                if(curload+b>mid){
                    reqdays++;
                    curload=b;
                }else{
                    curload+=b;
                }
            }
            if(reqdays<=days){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}