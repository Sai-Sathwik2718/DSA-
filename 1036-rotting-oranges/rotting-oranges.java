class Solution {
    public int orangesRotting(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int time=0;
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};
        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] cell=q.poll();
                int r=cell[0];
                int c=cell[1];
                for(int k=0;k<4;k++){
                    int nr=r+dr[k];
                    int nc=c+dc[k];
                    if(nr>=0 && nc>=0 && nr<rows && nc<cols && grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        q.add(new int[]{nr,nc});
                        fresh--;
                    }
                }
            }
            time++;
        }
        return fresh==0?time:-1;
    }
}