/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}*/

class Solution {
    public static int findMax(Node root) {
        if(root==null) return 0;
        int left=findMax(root.left);
        int right=findMax(root.right);
        return Math.max(root.data,Math.max(left,right));
    }

    public static int findMin(Node root) {
        if(root==null) return Integer.MAX_VALUE;
        int left=findMin(root.left);
        int right=findMin(root.right);
        return Math.min(root.data,Math.min(left,right));
        
    }
}