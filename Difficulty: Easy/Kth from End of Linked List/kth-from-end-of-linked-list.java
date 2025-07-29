/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node temp=head;
        int count=0;
        while(temp!=null){
         temp = temp.next;
         count++;
        }
        if(k>count){
            return -1;
        }
        count=count-k;
        temp =head;
        while(count-- >0){
            temp=temp.next;
        }
        return temp.data;
    }
}