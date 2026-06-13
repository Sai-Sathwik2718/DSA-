class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res=new StringBuilder();
        for(String w:words){
            int sum1=0;
            for(char c:w.toCharArray()){
                sum1+=weights[c-'a'];
            }
            int ans=sum1%26;
            char finalans=(char)('z'-ans);
            res.append(finalans);
        }
        return res.toString();
    }
}