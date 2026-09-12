/* Definition for Node
class Node
{
    int data;
    Node left;
    Node right;
    Node(int val)
    {
        this.data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public void rootToLeaf(Node root,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>arr){
        if(root==null) return;
        arr.add(root.data);
        if(root.left==null && root.right==null){
            ArrayList<Integer>copy=new ArrayList<>();
            copy.addAll(arr);
            ans.add(copy);
        }

        rootToLeaf(root.left,ans,arr);
        rootToLeaf(root.right,ans,arr);
        arr.remove(arr.size()-1);
        
    }
    public ArrayList<ArrayList<Integer>> paths(Node root) {
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        rootToLeaf(root,ans,arr);
        return ans;
    }
}