/*Complete the function below
Node is as follows:
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
};
*/
class Solution {
    public boolean isFullTree(Node root) {
        if(root.left==null && root.right==null) return true;
        if(root.left==null || root.right==null) return false;
        
        return isFullTree(root.left) && isFullTree(root.right);
    }
}