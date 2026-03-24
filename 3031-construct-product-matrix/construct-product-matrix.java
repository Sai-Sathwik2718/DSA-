class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int modulo=12345;
        int m=grid.length;
        int n=grid[0].length;
        int size=m*n;
        int[] arr=new int[m*n];
        int id=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[id++]=grid[i][j]%modulo;
            }
        }
        int[] pref=new int[size];
        pref[0]=arr[0];
        for(int i=1;i<size;i++){
            pref[i]=(pref[i-1]*arr[i])%modulo;
            
        }
        int[] suff=new int[size];
        suff[size-1]=arr[size-1];
        for(int i=size-2;i>=0;i--){
            suff[i]=(suff[i+1]*arr[i])%modulo;
        }
        int[][] ans=new int[m][n];
        for(int i=0;i<size;i++){
            int left=(i==0)?1:pref[i-1];
            int right=(i==size-1)?1:suff[i+1];
            int val=(left*right)%modulo;
            ans[i/n][i%n]=val;
        }
        return ans;

    

    }
}