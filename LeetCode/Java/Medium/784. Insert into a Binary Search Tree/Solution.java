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
    void attach(TreeNode root, int val){
        TreeNode temp=root;
        if(temp.val<val){
            if(temp.right==null) temp.right=new TreeNode(val);
            else attach(temp.right,val);
        }
        else{                    //temp.val>val
            if(temp.left==null) temp.left=new TreeNode(val);
            else attach(temp.left,val);
        }
    }
    
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        attach(root,val);
        return root;
    }
}