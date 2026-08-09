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
    void mirror(TreeNode root) {
        if(root==null) return;
        TreeNode temp=root.right;
        root.right=root.left;
        root.left=temp;
        mirror(root.left);
        mirror(root.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public boolean isSymmetric(TreeNode root) {
        mirror(root.left);
        return isSameTree(root.left,root.right);
    }
}