/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
        ArrayList<Integer> arr= new ArrayList<>();
        helper(root, arr);
        return arr;
    }
    public static void helper(Node current, ArrayList<Integer> arr){
        if(current == null){
            return;
        }
        helper(current.left, arr);
        helper(current.right,arr);
        arr.add(current.data);
    }
}