class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totgas=0,totcost=0;
        int n=gas.length;
        for(int i=0;i<n;i++){
            totgas+=gas[i];
            totcost+=cost[i];
        }
        if(totgas<totcost) return -1;
        int curgas=0,startind=0;
        for(int i=0;i<n;i++){
            curgas+=gas[i]-cost[i];
            if(curgas<0){
                startind=i+1;
                curgas=0;
            }
        }
        return startind;
    }
}