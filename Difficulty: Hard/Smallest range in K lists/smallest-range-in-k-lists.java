//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

public class DriverClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[][] = new int[k][n];
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < n; j++) arr[i][j] = sc.nextInt();
            }
            ArrayList<Integer> range = new Solution().findSmallestRange(arr);
            System.out.println(range.get(0) + " " + range.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    static class Node {
        int val, row, col;
        Node(int val, int row, int col) {
            this.val = val;
            this.row = row;
            this.col = col;
        }
    }

    public ArrayList<Integer> findSmallestRange(int[][] arr) {
        int k = arr.length;
        PriorityQueue<Node> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        int max = Integer.MIN_VALUE;
        int start = 0, end = Integer.MAX_VALUE;

        // Add the first element of each list to the heap
        for (int i = 0; i < k; i++) {
            int val = arr[i][0];
            minHeap.offer(new Node(val, i, 0));
            max = Math.max(max, val);
        }

        while (true) {
            Node minNode = minHeap.poll();
            int min = minNode.val;

            // Update range if smaller
            if (max - min < end - start) {
                start = min;
                end = max;
            }

            // Move to next element in the same list
            if (minNode.col + 1 < arr[minNode.row].length) {
                int nextVal = arr[minNode.row][minNode.col + 1];
                minHeap.offer(new Node(nextVal, minNode.row, minNode.col + 1));
                max = Math.max(max, nextVal);
            } else {
                // One list is exhausted
                break;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(start);
        result.add(end);
        return result;
    }
}