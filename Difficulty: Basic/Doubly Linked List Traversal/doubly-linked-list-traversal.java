// User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public static ArrayList<Integer> displayList(Node head) {
        // your code here
        ArrayList<Integer> res1 = new ArrayList<>();
        while(head != null){
            res1.add(head.data);
            head= head.next;
        }
        return res1;
        
    }
}