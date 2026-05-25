class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk=new Stack<>();
        int n=num.length();
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && (k>0) && num.charAt(i)<stk.peek()){
                stk.pop();
                k--;
            }
            stk.push(num.charAt(i));
        }
        while(k>0){
            stk.pop();
            k--;
        }
        StringBuilder res=new StringBuilder();
        while(!stk.isEmpty()){
            res.append(stk.pop());

        }
        res.reverse();
        while(res.length()>0 && res.charAt(0)=='0'){
            res.deleteCharAt(0);
        }
        return res.length()==0?"0":res.toString();


    }
}