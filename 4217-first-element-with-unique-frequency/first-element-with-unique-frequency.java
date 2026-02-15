class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Map<Integer,Integer> map2=new HashMap<>();
        for(int j:map.values()){
            map2.put(j,map2.getOrDefault(j,0)+1);
        }
        int ans=-1;
        for(int k:nums){
            int fre=map.get(k);
            if(map2.get(fre)==1){
                return k;
            }
        }
        return -1;
    }
}