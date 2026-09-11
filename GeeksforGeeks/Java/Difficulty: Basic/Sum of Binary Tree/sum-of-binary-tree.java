/* Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
} */

class Solution {
    static int sumBT(Node root) {
        if(root==null) return 0;
        int left=sumBT(root.left);
        int right=sumBT(root.right);
        return root.data+left+right;
    }
}