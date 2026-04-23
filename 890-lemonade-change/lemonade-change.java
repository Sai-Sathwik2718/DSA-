class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fivedollars=0,tendollars=0;
        for(int x:bills){
            if(x==5){
                fivedollars++;
            }else if(x==10){
                if(fivedollars>0){
                    fivedollars--;
                    tendollars++;
                }else{
                    return false;
                }
            }else{
                if(fivedollars>0 && tendollars>0){
                    fivedollars--;
                    tendollars--;
                }else if(fivedollars>2){
                    fivedollars-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}