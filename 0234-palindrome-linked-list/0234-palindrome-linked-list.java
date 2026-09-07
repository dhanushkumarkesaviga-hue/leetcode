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
    public boolean isPalindrome(ListNode head) {
         ListNode fast =head ;  ListNode slow = head;
            while(fast != null && fast.next != null){
                 
                slow= slow.next;
                fast = fast.next.next;
                
            }
            
            ListNode pre = null;
            
                ListNode curr = slow;
           
                while(curr!=null){
                    
                  ListNode cn =  curr.next;
                curr.next= pre;
                   pre = curr;
                   curr = cn; 
                } 
                ListNode d= head; 
ListNode dummy = pre;
              while(dummy!=null){
                if(d.val!=dummy.val){
                    return false;
                }
dummy = dummy.next;d =d.next;
              }
            
   return true; }
}