class Solution {
    public int maximumBeauty(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int left=0;
        int right=0;
        int maxb=0;
        for(right=0;right<n;right++){
            while(nums[right]-nums[left]>2*k){
                left++;
            }
            maxb=Math.max(maxb,right-left+1);
        }
        return maxb;
    }
}