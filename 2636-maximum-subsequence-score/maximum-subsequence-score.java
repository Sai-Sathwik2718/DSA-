class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        int[][] pairs=new int[n][2];
        for(int i=0;i<n;i++){
            pairs[i][0]=nums1[i];
            pairs[i][1]=nums2[i];
        }
        Arrays.sort(pairs,(a,b)->b[1]-a[1]);
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        long sum=0L;
        long maxi=0L;
        for(int i=0;i<n;i++){
            minheap.offer(pairs[i][0]);
            sum+=pairs[i][0];
            if(minheap.size()>k){
                sum-=minheap.poll();
            }
            if(minheap.size()==k){
                maxi=Math.max(maxi,sum*pairs[i][1]);
            }
        }
        return maxi;

    }
}