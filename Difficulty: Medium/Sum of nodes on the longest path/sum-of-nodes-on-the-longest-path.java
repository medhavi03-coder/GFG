/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
} */
class Solution {
    // Helper class to return both length and sum
    class Result {
        int len;
        int sum;
        Result(int len, int sum) {
            this.len = len;
            this.sum = sum;
        }
    }

    public int sumOfLongRootToLeafPath(Node root) {
        Result res = helper(root);
        return res.sum;
    }

    private Result helper(Node node) {
        if (node == null) {
            return new Result(0, 0);
        }

        Result left = helper(node.left);
        Result right = helper(node.right);

        // Choose longer path or one with max sum if equal length
        if (left.len > right.len) {
            return new Result(left.len + 1, left.sum + node.data);
        } else if (right.len > left.len) {
            return new Result(right.len + 1, right.sum + node.data);
        } else {
            // Both lengths are same — choose max sum
            int maxSum = Math.max(left.sum, right.sum);
            return new Result(left.len + 1, maxSum + node.data);
        }
    }
}
