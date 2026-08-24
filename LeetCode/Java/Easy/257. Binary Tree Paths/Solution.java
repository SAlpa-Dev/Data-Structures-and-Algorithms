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
    public void rootToLeaf(TreeNode root,List<String>ans,String s){
        if(root==null) return;
        if(s.length()==0) s+=root.val;
        else s+="->"+root.val;
        if(root.left==null && root.right==null){
            ans.add(s);
        }
        rootToLeaf(root.left,ans,s);
        rootToLeaf(root.right,ans,s);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>ans=new ArrayList<>();
        String s="";
        rootToLeaf(root,ans,s);
        return ans;
    }
}