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
    HashMap<Integer,Integer> map=new HashMap<>();
    int postidx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        postidx=postorder.length-1;
        return build(postorder,0,inorder.length-1);
    }
    public  TreeNode build(int[] postorder,int start,int end){
        if(start>end){
            return null;
        }
        int rootval=postorder[postidx--];
        TreeNode root=new TreeNode(rootval);
        int pos=map.get(rootval);
        root.right=build(postorder,pos+1,end);
        root.left=build(postorder,start,pos-1);
        return root;
    
    }
}