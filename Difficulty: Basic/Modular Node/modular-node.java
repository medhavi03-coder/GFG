/*node class of the linked list is as:
class Node {
    int data;
     Node next;
     Node(int key)
     {
         data = key;
         next = null;
     }
}
*/
// Your task is to complete the function
// function should return the modular Node
// if no such node is present then return -1
class Solution {
    public int modularNode(Node head, int k) {
        while(head==null){
            return 0;
        }
        int count=0;
        int max =0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int rem = count%k;
        max = count-rem;
        temp=head;
        int i =-1;
        while(max-- >0){
            i=temp.data;
            temp = temp.next;
        }
        return i;
    }
}