class Solution {
    public String decodeString(String s) {
        Stack<String> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int num=ch-'0';
                while(i+1 < n && Character.isDigit(s.charAt(i+1))){
                    num=num*10+s.charAt(i+1)-'0';
                    i++;
                }
                st.push(Integer.toString(num));
            }else if(ch=='[' || (ch>='a' && ch<='z')){
                st.push(Character.toString(ch));
            }else if(ch==']'){
                StringBuilder sb=new StringBuilder();
                while(!st.peek().equals("[")){
                    sb.append(st.pop());
                }
                st.pop();
                int mul=Integer.parseInt(st.pop());
                String str=sb.toString();
                while(mul-->0){
                    st.push(str);
                }
            }else{
                st.push(Character.toString(ch));
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}