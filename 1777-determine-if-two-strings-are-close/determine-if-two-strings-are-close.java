class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashSet<Character> set1=new HashSet<>();
        HashSet<Character> set2=new HashSet<>();
        if(word1.length()!=word2.length()){
            return false;
        }
        for(char ch:word1.toCharArray()){
            set1.add(ch);
        }
        for(char ch:word2.toCharArray()){
            set2.add(ch);
        }
        for(char ch:set1){
            if(!set2.contains(ch)){
                return false;
            }
        }
        List<Integer> arr=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        int[] freq=new int[26];
        for(char ch:word1.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++) arr.add(freq[i]);
        int[] freq2=new int[26];
        for(char ch:word2.toCharArray()){
            freq2[ch-'a']++;
        }
        for(int i=0;i<26;i++) arr2.add(freq2[i]);
        Collections.sort(arr);
        Collections.sort(arr2);
        return arr.equals(arr2);


    }
}