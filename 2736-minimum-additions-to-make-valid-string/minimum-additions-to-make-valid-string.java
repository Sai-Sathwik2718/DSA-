class Solution {
    public int addMinimum(String word) {
        int n=word.length();
        int i=0,res=0;
        while(i<n){
            int cnt=0;
            if(word.charAt(i)=='a'){
                cnt++;
                i++;
            }
            if(i<n && word.charAt(i)=='b'){
                cnt++;
                i++;
            }
            if(i<n && word.charAt(i)=='c'){
                cnt++;
                i++;
            }
            res+=3-cnt;
        }
        return res;
    }
}