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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list= new ArrayList<>();ListNode temp =head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        List<Integer> lis = new ArrayList<>();
        for(int i = 0;i<list.size();i++){
            if(!set.contains(list.get(i))){
lis.add(list.get(i));
set.add(list.get(i));
            }
        }
        
        ListNode n = new ListNode(lis.get(0));
        ListNode it=n;
        for(int  j =1;j<lis.size();j++){
      n.next = new ListNode(lis.get(j));
      n=n.next;
        }
  return it;  }
}