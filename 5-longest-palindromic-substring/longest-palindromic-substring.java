class Solution {
    public String longestPalindrome(String s) {
       int n=s.length();
       String ans="";
       for(int i=0;i<n;i++){
        int st=i,end=i;
        while(st>=0 && end<n && s.charAt(st)==s.charAt(end)){
            st--;
            end++;
        }
        String temp=s.substring(st+1,end);
        if(temp.length()>ans.length()) ans=temp;
        st=i;
        end=i+1;
        while(st>=0 && end<n && s.charAt(st)==s.charAt(end)){
            st--;
            end++;
        }
        temp=s.substring(st+1,end);
        if(temp.length()>ans.length()) ans=temp;
       }
       return ans;
    }
}