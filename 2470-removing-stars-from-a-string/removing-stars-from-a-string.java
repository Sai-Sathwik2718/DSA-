class Solution {
    public String removeStars(String s) {
        char[] arr=s.toCharArray();
        int top=0;
        for(char c:arr){
            if(c=='*'){
                top--;
            }else{
                arr[top++]=c;
            }
        }
        return new String(arr,0,top);
    }
}