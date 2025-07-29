/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    int getMiddle(Node head) {
        // Your code here.
        Node temp = head;
        int count=0;
        int middle=0;
        while(temp != null){
            temp=temp.next;
            count++;
        }
        temp=head;
        if(count%2 == 0){
            middle = (count/2)+1;
            while(middle-- >1){
                temp=temp.next;
            }
        }
        else{
            middle=(count+1)/2;
            while(middle-- >1){
                temp=temp.next;
            }
        }
        
            return temp.data;
    }
}