class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()) return false;
        int[] charscnt=new int[26];
        for(char ch:magazine.toCharArray()){
            charscnt[ch-'a']++;
        }
        for(char ch:ransomNote.toCharArray()){
            int charcnt=charscnt[ch-'a'];
            if(charcnt<=0) return false;
            charscnt[ch-'a']--;
        }
        return true;
    }
}