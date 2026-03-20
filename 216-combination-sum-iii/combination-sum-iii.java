class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        f(ans,temp,k,n,1,0);
        return ans;
    }
    public void f(List<List<Integer>> ans,List<Integer> temp,int k,int n,int idx,int sum){
        if(sum>n || temp.size()>k) return;
        if(sum==n && temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<=9;i++){
            if(sum+i<=n){
                temp.add(i);
                f(ans,temp,k,n,i+1,sum+i);
                temp.remove(temp.size()-1);
            }else{
                break;
            }
        }
    }
}