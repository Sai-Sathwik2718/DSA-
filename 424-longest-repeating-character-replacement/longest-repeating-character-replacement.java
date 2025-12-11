class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int left=0,right=0;
        int maxcnt=0;
        int maxlen=0;
        while(right<s.length()){
            freq[s.charAt(right)-'A']++;
            maxcnt=Math.max(maxcnt,freq[s.charAt(right)-'A']);
            while((right-left+1)-maxcnt>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;

    }
}