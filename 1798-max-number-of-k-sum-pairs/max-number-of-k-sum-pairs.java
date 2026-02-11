class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int cnt=0;
        for(int num:nums){
            int c=k-num;
            if(map.getOrDefault(c,0)>0){
                cnt++;
                map.put(c,map.get(c)-1);
            }else{
                map.put(num,map.getOrDefault(num,0)+1);
            }
        
        }
        return cnt;
    }
}