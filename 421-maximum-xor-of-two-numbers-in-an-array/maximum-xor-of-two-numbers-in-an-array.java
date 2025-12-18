class TrieNode{
    TrieNode[] child=new TrieNode[2];
}
class Trie{
    TrieNode root=new TrieNode();
    void insert(int num){
        TrieNode node=root;
        for(int i=31;i>=0;i--){
            int bit=(num>>i)&1;
            if(node.child[bit]==null){
                node.child[bit]=new TrieNode();
            }
            node=node.child[bit];
        }
    }
    int getMaxxor(int num){
        TrieNode node=root;
        int maxxor=0;
        for(int i=31;i>=0;i--){
            int bit=(num>>i)&1;
            int opposite=1-bit;
            if(node.child[opposite]!=null){
                maxxor|=(1<<i);
                node=node.child[opposite];
            
            }else{
                node=node.child[bit];
            }
        }
        return maxxor;
    }
}



class Solution {
    public int findMaximumXOR(int[] nums) {
        Trie trie=new Trie();
        int max=0;
        for(int num:nums){
            trie.insert(num);
        }
        for(int num:nums){
            max=Math.max(max,trie.getMaxxor(num));
        }
        return max;
    }
}