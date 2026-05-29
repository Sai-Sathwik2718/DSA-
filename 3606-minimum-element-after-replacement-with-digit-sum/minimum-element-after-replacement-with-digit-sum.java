class Solution {
    public int minElement(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int x:nums){
            String ch=String.valueOf(x);
            int sum=0;
            for(char c:ch.toCharArray()){
                sum+=c-'0';
            }
            ans.add(sum);

        }
        Collections.sort(ans);
        return ans.get(0);
    }
}