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
    public ListNode partition(ListNode head, int x) {
        ListNode before=new ListNode(0);
        ListNode after=new ListNode(0);
        ListNode b1h=before;
        ListNode b2h=after;
        while(head!=null){
            if(head.val<x){
                
                b1h.next=head;
                b1h=b1h.next;
            }
            else{
                
                b2h.next=head;
                b2h=b2h.next;
            }
            head=head.next;
        }
        b2h.next=null;
        b1h.next=after.next;
        return before.next;
    }
}
