/*Node structure
class Node {
    public int data;
    public Node left, right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public boolean level(Node root){
        if(root==null) return true;
        int left=height(root.left);
        int right=height(root.right);
        if(left==right) return true;
        else return false;
    }
    public int height(Node root){
        if(root==null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
    public boolean isFullTree(Node root) {
        if(root.left==null && root.right==null) return true;
        if(root.left==null || root.right==null) return false;
        return isFullTree(root.left) && isFullTree(root.right);
    }
    
    boolean isPerfect(Node root) { 
        return isFullTree(root) && level(root);
    }
}