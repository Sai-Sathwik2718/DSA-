class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        solve(0,board,ans,n);
        return ans;
    }
    public static void solve(int row,char[][] board,List<List<String>> ans,int n){
        if(row==n){
            ans.add(construct(board));
            return;
        }
        for(int col=0;col<n;col++){
            if(issafe(row,col,board,n)){
                board[row][col]='Q';
                solve(row+1,board,ans,n);
                board[row][col]='.';
            }
        }
    }
    public static boolean issafe(int row,int col,char[][] board,int n){
        int r,c;
        r=row;
        c=col;
        while(r>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
        }
        r=row;
        c=col;
        while(r>=0 && c>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c--;
        }
        r=row;
        c=col;
        while(r>=0 && c<n){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
    public static List<String> construct(char[][] board){
        List<String> temp=new ArrayList<>();
        for(char[] row:board){
            temp.add(new String(row));
        }
        return temp;
    }

}