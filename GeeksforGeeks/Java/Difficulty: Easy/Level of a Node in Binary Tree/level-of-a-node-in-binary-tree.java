class Solution {
    int getLevel(Node node, int data) {
        if(node==null) return 0;
        if(node.data==data) return 1;
        int left=getLevel(node.left,data);
        if(left!=0) return left+1;
        int right=getLevel(node.right,data);
        if(right!=0) return right+1;
        return 0;
    }
}