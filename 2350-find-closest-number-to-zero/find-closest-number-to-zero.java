class Solution {
    public int findClosestNumber(int[] nums) {
        int close=nums[0];
        int mindist=Math.abs(nums[0]);
        for(int num:nums){
            int abs=Math.abs(num);
            if(abs<mindist || (abs==mindist && num>close)){
                close=num;
                mindist=abs;
            }
        }
        return close;
    }
}