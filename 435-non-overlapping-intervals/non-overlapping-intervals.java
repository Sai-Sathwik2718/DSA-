class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int res=0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int curr[]=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<curr[1]){
                res++;
            }else{
                curr=intervals[i];
            }
        }
        return res;
    }
}