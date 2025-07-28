/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/

class Solution {
    // Function to check whether two linked lists are identical or not.
    public boolean areIdentical(Node head1, Node head2) {
        // write your code here
        if((head1 == null && head2 != null )|| (head1 != null && head2 == null)){
            return false;
        }
        int count1= 0;
        int count2= 0;
        Node temp1= head1;
        Node temp2= head2;
        while(temp1 != null ){
            temp1=temp1.next;
            count1++;
        }
        while(temp2 != null ){
            temp2=temp2.next;
            count2++;
        }
        if(count1 == count2){
             while(count1-- > 0){
                 if(head1.data != head2.data){
                     return false;
                 }
                 head1=head1.next;
                 head2= head2.next;
             }
        }
        else{
            return false;
        }
        return true;
        
    }
}