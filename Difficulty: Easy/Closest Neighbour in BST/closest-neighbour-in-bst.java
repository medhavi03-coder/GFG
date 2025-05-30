/*
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
} */
class Solution {
    public int findMaxFork(Node root, int k) {
        int ans = -1;  // Default if no such value exists

        while (root != null) {
            if (root.data == k) {
                return k; // Exact match found
            }

            if (root.data < k) {
                ans = root.data; // Valid candidate
                root = root.right; // Look for a possibly bigger one ≤ k
            } else {
                root = root.left; // Look for smaller value
            }
        }

        return ans;
    }
}
