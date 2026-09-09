
class Solution {
    public int minValue(Node root) {
        Node temp=root;
        while(temp.left!=null) temp=temp.left;
        return temp.data;
    }
}