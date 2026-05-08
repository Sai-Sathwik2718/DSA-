class Solution {
    public int maxWidthRamp(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(list.isEmpty() || nums[i]<nums[list.get(list.size()-1)]){
                list.add(i);
            }
        }
        int maxw=0;
        for(int j=n-1;j>=0;j--){
            int low=0;
            int high=list.size()-1;
            int ans=-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(nums[list.get(mid)]<=nums[j]){
                    ans=list.get(mid);
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            if(ans!=-1){
                maxw=Math.max(maxw,j-ans);
            }
        }
        return maxw;
        
    }
}