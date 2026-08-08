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
class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node,int level){
        this.node=node;
        this.level=level;
    }
}
class Solution {
    public void bfsTraversal(TreeNode root,List<List<Integer>>ans){
        if(root==null) return;
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair front=q.poll();
            int level=front.level;
            if(ans.size()==level) ans.add(new ArrayList<>());
            if(level%2==0) ans.get(level).add(front.node.val);
            else ans.get(level).add(0,front.node.val);
            if(front.node.left!=null) q.add(new Pair(front.node.left,level+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right,level+1));
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        bfsTraversal(root,ans);
        return ans;
    }
}