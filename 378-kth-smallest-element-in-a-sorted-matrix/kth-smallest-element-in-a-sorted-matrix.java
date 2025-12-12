class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans.add(matrix[i][j]);
            }
        }
        PriorityQueue<Integer> pr=new PriorityQueue<>();
        for(int h:ans){
            pr.add(h);
        }
        for(int i=1;i<k;i++){
            pr.poll();
        }
        return pr.poll();
    }
}