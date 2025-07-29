class Solution {
    // Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        // write code here
        ArrayList<Integer>arr = new ArrayList<>();
        helper(root,arr);
        return arr;
    }
    static void helper(Node current, ArrayList<Integer> arr){
        if(current == null){
            return;
        }
        arr.add(current.data);
        helper(current.left, arr);
        helper(current.right, arr);
    }
}