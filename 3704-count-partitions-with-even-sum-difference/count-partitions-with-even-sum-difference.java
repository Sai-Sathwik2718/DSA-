class Solution {
    public int countPartitions(int[] nums) {
        int sum=0,ans=0;
        for(int a:nums){
            sum+=a;
        }
        int n=nums.length-1;
        int leftpart=0;
        for(int i=0;i<n;i++){
            leftpart+=nums[i];
            sum-=nums[i];
            if((leftpart-sum)%2==0){
                ans++;
            }
        }
        return ans;
    }
}