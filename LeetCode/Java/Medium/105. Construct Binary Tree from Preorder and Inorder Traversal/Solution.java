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
    int k=0;
    public TreeNode binaryTree(int[] preorder, int[] inorder,int i,int j){
        if(i>j) return null;
        int rootVal=preorder[k++];
        TreeNode root=new TreeNode(rootVal);
        int idx=i;
        while(idx<j && inorder[idx]!=rootVal) idx++;
        root.left=binaryTree(preorder,inorder,i,idx-1);
        root.right=binaryTree(preorder,inorder,idx+1,j);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return binaryTree(preorder,inorder,0,inorder.length-1);
    }
}