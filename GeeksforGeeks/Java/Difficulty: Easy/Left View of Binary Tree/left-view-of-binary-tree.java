/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}*/

class Solution {
    public void rightView(Node root, int level, ArrayList<Integer>ans){
        if(root==null) return;
        if(ans.size()==level) ans.add(root.data);
        rightView(root.left,level+1,ans);
        rightView(root.right,level+1,ans);
    }
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
        rightView(root,0,ans);
        return ans;
    }
}