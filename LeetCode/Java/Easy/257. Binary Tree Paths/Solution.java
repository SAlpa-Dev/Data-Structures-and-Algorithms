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
    public void paths(TreeNode root,List<String>ans,String s){
        if(root==null) return;
        s=s+root.val;
        if(root.left==null && root.right==null){
            ans.add(s);
        }

        paths(root.left,ans,s+"->");
        paths(root.right,ans,s+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>ans=new ArrayList<>();
        String s="";
        paths(root,ans,s);
        return ans;   
    }
}