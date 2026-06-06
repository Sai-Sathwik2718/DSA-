class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int rghtsum=0;
        for(int x:nums){
            rghtsum+=x;
        }
        int lftsum=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            rghtsum-=nums[i];
            ans[i]=Math.abs(lftsum-rghtsum);
            lftsum+=nums[i];
        }
        return ans;
    }
}