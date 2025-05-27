import java.util.*;

class Solution {
    int index = 0;
    public ArrayList<Integer> leafNodes(int[] preorder) {
        ArrayList<Integer> leaves = new ArrayList<>();
        findLeaves(preorder, leaves, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return leaves;
    }

    private TreeNode findLeaves(int[] preorder, ArrayList<Integer> leaves, int min, int max) {
        if (index >= preorder.length || preorder[index] < min || preorder[index] > max) {
            return null;
        }

        int val = preorder[index++];
        TreeNode node = new TreeNode(val);

        // Recursively check for left and right subtree
        TreeNode left = findLeaves(preorder, leaves, min, val);
        TreeNode right = findLeaves(preorder, leaves, val, max);

        // If both left and right are null, it's a leaf node
        if (left == null && right == null) {
            leaves.add(val);
        }

        return node;
    }

    // dummy TreeNode class, only used for structure (not building full tree)
    class TreeNode {
        int val;
        TreeNode(int v) {
            val = v;
        }
    }
}
