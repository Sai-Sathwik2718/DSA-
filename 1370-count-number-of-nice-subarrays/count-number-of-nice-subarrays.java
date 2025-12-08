class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countmost(nums,k)-countmost(nums,k-1);
    }
    public int countmost(int[] nums,int k){
        int left=0,right=0,res=0;
        for(right=0;right<nums.length;right++){
            if(nums[right]%2!=0){
                k--;
            }
            while(k<0){
                if(nums[left]%2!=0){
                    k++;
                }
                left++;
            }
            res+=(right-left+1);
        }
        return res;
    }
}