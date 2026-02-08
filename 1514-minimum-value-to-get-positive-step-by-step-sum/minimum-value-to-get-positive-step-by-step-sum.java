class Solution {
    public int minStartValue(int[] nums) {
        int n=nums.length;
        int pre=0;
        int mini=0;
        for(int i:nums){
            pre+=i;
            mini=Math.min(pre,mini);
        }
        return 1-mini;
    }
}