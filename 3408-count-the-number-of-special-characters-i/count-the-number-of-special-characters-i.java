class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> lower=new HashSet<>();
        HashSet<Character> upper=new HashSet<>();
        HashSet<Character> invalid=new HashSet<>();
        for(char c:word.toCharArray()){
            if(Character.isLowerCase(c)){
                if(upper.contains(Character.toUpperCase(c))){
                    invalid.add(c);
                }
                lower.add(c);
            }else{
                upper.add(c);
            }
        }
        int cnt=0;
        for(char c:lower){
            char ch=Character.toUpperCase(c);
            if(upper.contains(ch) && !invalid.contains(ch)){
                cnt+=1;
            }
        }
        return cnt;
    }
}