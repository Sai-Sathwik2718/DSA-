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
    int preidx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(preorder,0,inorder.length-1);
    }
    public  TreeNode build(int[] preorder,int start,int end){
        if(start>end){
            return null;
        }
        int rootval=preorder[preidx++];
        TreeNode root=new TreeNode(rootval);
        int pos=map.get(rootval);
        root.left=build(preorder,start,pos-1);
        root.right=build(preorder,pos+1,end);
        return root;
    }

}