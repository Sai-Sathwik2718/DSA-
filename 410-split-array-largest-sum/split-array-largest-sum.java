class Solution {
    public int splitArray(int[] nums, int k) {
        int min=0;
        int max=0;
        for(int i:nums){
            max+=i;
            if(i>min){
                min=i;
            }
        }
        int res=max;
        while(min<=max){
            int mid=(min+max)/2;
            if(valid(nums,k,mid)){
                res=mid;
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return res;
    }
    public static boolean valid(int[] nums,int k,int mid){
        int cnt=1;
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>mid){
                sum=nums[i];
                cnt++;
            }
        }
        if(cnt<=k){
            return true;
        }
        return false;
    }
}