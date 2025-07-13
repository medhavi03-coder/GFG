import java.util.PriorityQueue;
import java.util.Collections; // Required for Collections.reverseOrder()

// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Create a Max-Heap
        // By default, PriorityQueue is a Min-Heap.
        // To make it a Max-Heap, use Collections.reverseOrder()
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            // Add element to the heap
            maxHeap.add(arr[i]);

            // If the heap size exceeds k, remove the largest element (root)
            // This ensures that the heap always contains the k smallest elements encountered so far
            // with the largest among them at the root.
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // After iterating through all elements, the root of the max-heap
        // will be the kth smallest element.
        return maxHeap.peek();
    }
}