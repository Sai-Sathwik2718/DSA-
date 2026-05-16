class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> st=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch=='.') continue;
                String row=ch+"in row"+i;
                String col=ch+"in col"+j;
                String box=ch+"in box"+((i/3)*3+(j/3));
                if(st.contains(row)||st.contains(col)||st.contains(box)){
                    return false;
                }
                st.add(row);
                st.add(col);
                st.add(box);
            }
        }
        return true;
    }
}