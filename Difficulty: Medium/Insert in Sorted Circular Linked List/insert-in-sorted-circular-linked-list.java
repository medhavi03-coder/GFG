/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
        Node newNode = new Node(data);
        
        // Case 1: Empty list
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        
        Node curr = head;

        while (true) {
            // Case 2: Correct place between curr and curr.next
            if (curr.data <= data && data <= curr.next.data) {
                break;
            }

            // Case 3: At the rotation point (max -> min)
            if (curr.data > curr.next.data) {
                if (data >= curr.data || data <= curr.next.data) {
                    break;
                }
            }

            curr = curr.next;

            // Case 4: Came full circle, insert anywhere
            if (curr == head) {
                break;
            }
        }

        // Insert newNode after curr
        newNode.next = curr.next;
        curr.next = newNode;

        // If inserted data is smaller than head, return new head
        return (data < head.data) ? newNode : head;
    }
}
