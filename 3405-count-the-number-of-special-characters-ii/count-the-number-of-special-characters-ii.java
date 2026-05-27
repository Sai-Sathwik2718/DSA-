class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> small=new HashSet<>();
        HashSet<Character> capital=new HashSet<>();
        HashSet<Character> invalid=new HashSet<>();
        for(char ch:word.toCharArray()){
            if(Character.isLowerCase(ch)){
                if(capital.contains(Character.toUpperCase(ch))){
                    invalid.add(ch);
                }
                small.add(ch);
            }else{
                capital .add(ch);
            }
        }
        int cnt=0;
        for(char ch:small){
            char cd=Character.toUpperCase(ch);
            if(capital.contains(cd) && !invalid.contains(ch)){
                cnt+=1;

            }
            
        }
        return cnt;
    }
}