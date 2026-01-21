class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int ke=entry.getKey();
            int val=entry.getValue();
            if(val>1){
                return ke;
            }
        }
        return -1;

    }
}