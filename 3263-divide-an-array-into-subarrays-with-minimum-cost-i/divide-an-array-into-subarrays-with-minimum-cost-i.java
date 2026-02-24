class Solution {
    public int minimumCost(int[] nums) {
        int a=nums[0];
        Arrays.sort(nums,1,nums.length);
        return a+nums[1]+nums[2];
    }
}