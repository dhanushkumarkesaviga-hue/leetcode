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
    public ListNode reverseKGroup(ListNode head, int k) {
    
        Stack<ListNode> st= new Stack<>();
        ListNode dummy= new ListNode(0);
        ListNode dum=dummy;
        ListNode curr= head ;
        while(curr!=null){
            st.push(curr);
            curr=curr.next;
            if(st.size()==k){
                while(!st.isEmpty()){
                    dum.next =st.pop();
                    dum= dum.next;
                }
            }
        }
        while(!st.isEmpty()){
            dum.next=st.remove(0);
             dum= dum.next;
        }
        dum.next=null;
   return dummy.next; 
          

}}