class Solution {
    // int[] t=new int[10001];
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        return Math.max(roblinear(nums,0,n-2),roblinear(nums,1,n-1));
        

    }
    public int roblinear(int[] nums,int start,int end){
        int prev2=0,prev1=0;
        for(int i=start;i<=end;i++){
            int curr=Math.max(prev1,prev2+nums[i]);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }

}