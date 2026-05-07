class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=findidx(nums,target,true);
        int end=findidx(nums,target,false);
        return new int[]{start,end};
    }
    public int findidx(int[] nums,int target,boolean firstidx){
        int ans=-1;
        int left=0;
        int n=nums.length;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                ans=mid;
                if(firstidx){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
        }
        return ans;
    }
}