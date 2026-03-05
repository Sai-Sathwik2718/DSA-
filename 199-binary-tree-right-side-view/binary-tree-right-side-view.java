/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Queue<TreeNode> qu=new LinkedList<>();
        if(root==null){
            return res;
        }
        TreeNode temp=root;
        qu.add(temp);
        while(!qu.isEmpty()){
            int a=qu.size();
            for(int i=0;i<a;i++){
                TreeNode node=qu.poll();
                if(i==a-1) res.add(node.val);
                if(node.left!=null) qu.add(node.left);
                if(node.right!=null) qu.add(node.right);
            }
        }
        return res;
    }
}