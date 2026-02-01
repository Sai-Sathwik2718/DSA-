class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res=new ArrayList<>();
        int maxi=candies[0];
        for(int x:candies){
            if(x>maxi){
                maxi=x;
            }
        }
        int n=candies.length;
        for(int i=0;i<n;i++){
            if((candies[i]+extraCandies)>=maxi){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
}