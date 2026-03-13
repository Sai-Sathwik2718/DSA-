class SmallestInfiniteSet {
    private int curr;
    private PriorityQueue<Integer> minHeap;
    private Set<Integer> addedBack;
    public SmallestInfiniteSet() {
        curr=1;
        minHeap=new PriorityQueue<>();
        addedBack=new HashSet<>();
    }
    
    public int popSmallest() {
        if(!minHeap.isEmpty()){
            int small=minHeap.poll();
            addedBack.remove(small);
            return small;

        }
        return curr++;
    }
    
    public void addBack(int num) {
        if(num<curr && !addedBack.contains(num)){
            minHeap.offer(num);
            addedBack.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */