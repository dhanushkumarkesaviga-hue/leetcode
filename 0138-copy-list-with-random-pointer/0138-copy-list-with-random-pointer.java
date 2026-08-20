/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node temp = head;
        Node q = null;
        while (temp != null) {
            q = temp.next;
            Node A = new Node(temp.val);
            temp.next = A;
            A.next = q;
            temp = q;
        }
        temp = head;
        while ( temp!= null) {
             if(temp.random!=null){temp.next.random = temp.random.next;}
            temp = temp.next.next;
        }
        temp = head;
        Node d = new Node(0);
        Node r = d;
        while (temp != null && temp.next != null) {
            Node cp = temp.next;
            d.next = cp;
            d = d.next;
            temp.next = cp.next;
            temp = temp.next;
        }
        return r.next;
    }
}