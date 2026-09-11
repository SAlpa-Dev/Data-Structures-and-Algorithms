/* Structure of Binary Tree Node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    void mirror(Node root) {
        if(root==null) return;
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
    }
}