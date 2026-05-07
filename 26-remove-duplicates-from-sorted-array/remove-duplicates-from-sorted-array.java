class Solution {
    public int removeDuplicates(int[] nums) {
        int index=0;
        int size=nums.length;
        int curr=1;
        while(curr<size){
            if(nums[curr]!=nums[curr-1]){
                index++;
                nums[index]=nums[curr];
            }
            curr++;
        }
        return index+1;
    }
}