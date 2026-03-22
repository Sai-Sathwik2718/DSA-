class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if(isEqual(mat,target)){
                return true;
            }
            rotate90(mat);
        }
        return false;
    }
    public void rotate90(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[0].length;j++){
                int temp=0;
                temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length/2;j++){
                int temp=0;
                temp=mat[i][j];
                mat[i][j]=mat[i][mat.length-1-j];
                mat[i][mat.length-1-j]=temp;
            }
        }
    }
    public boolean isEqual(int[][] mat,int[][] target){
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}