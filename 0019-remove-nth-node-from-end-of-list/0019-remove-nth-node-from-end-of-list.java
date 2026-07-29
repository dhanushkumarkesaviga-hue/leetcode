/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
                ListNode temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        } if(len==1) return null;
       
        int p = len-n;
        if(p==0){
            return head.next;
        }
        temp =head;int count =0;
        ListNode l=null;    ListNode s=null;
while(temp!=null){
    if(count==p-1){
       temp.next=temp.next.next;
    }  count++;
    temp=temp.next;
}
   return head; }
}