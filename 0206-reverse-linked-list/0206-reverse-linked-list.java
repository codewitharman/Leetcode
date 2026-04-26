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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;


        ListNode previous=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=previous;
            previous=curr;
            curr=next;

        }
        return previous;
    }
}