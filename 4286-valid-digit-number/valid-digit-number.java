class Solution {
    public boolean validDigit(int n, int x) {
        String s=Integer.toString(n);
        if(s.charAt(0)-'0'==x){
            return false;
        }
        return s.contains(Integer.toString(x));
    }
}