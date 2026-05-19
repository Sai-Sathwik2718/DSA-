class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int num:nums){
            currsum=Math.max(num,currsum+num);
            maxsum=Math.max(maxsum,currsum);
        }
        int minsum=Integer.MAX_VALUE;
        currsum=0;
        for(int num:nums){
            currsum=Math.min(num,currsum+num);
            minsum=Math.min(minsum,currsum);
        }
        int totsum=0;
        for(int j:nums){
            totsum+=j;
        }
        int maxcircular=totsum-minsum;
        if(maxsum>0){
            return Math.max(maxsum,maxcircular);
        }
        return maxsum;
    }
}