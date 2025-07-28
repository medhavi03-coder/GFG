/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int count=1;
        if(head == null){
            return 0;
        }
        while(head.next != null){
            head=head.next;
            count++;
        }
        return count;
        
    }
}