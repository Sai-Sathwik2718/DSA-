class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int a=Math.max(0,n-k);
        int b=n+k;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=a;i<=b;i++){
            if(((Math.abs(n-i))<=k) && ((n&i)==0)){
                arr.add(i);
            }
        }
        int sum=0;
        for(int d:arr){
            sum+=d;
        }
        return sum;
    }
}