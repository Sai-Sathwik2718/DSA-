class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int first=Integer.MAX_VALUE,sec=Integer.MAX_VALUE;
        for(int x:nums){
            if(x<=first){
                first=x;
            }else if(x<=sec){
                sec=x;
            }else{
                return true;
            }
        }
        return false;
    }
}