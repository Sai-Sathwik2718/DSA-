class Solution {
    public int compareBitonicSums(int[] nums) {
        int[] nums2=nums;
        int peak=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[peak]){
                peak=i;
            }
        }
       
        long sum1=0,sum2=0;
        for(int i=0;i<=peak;i++){
            sum1+=nums[i];
        }
        for(int i=peak;i<n;i++){
            sum2+=nums[i];
        }
        if(sum1<sum2){
            return 1;
        }else if(sum1>sum2){
            return 0;
        }else{
            return -1;
        }
    }
}