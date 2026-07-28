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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        int c=0;
        ListNode temp=head;
        while(temp.next!=null){
            c++;
            temp=temp.next;
        }
        ListNode tail=temp;
        c++;
        tail.next=head;
        k=k%c;
        int steps=c-k;
        ListNode newtail=head;
        for(int i=1;i<steps;i++){
            newtail=newtail.next;
        }
        ListNode newhead=newtail.next;
        newtail.next=null;
        return newhead;
        
    }
}
