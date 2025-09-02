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
        // //recursive approach
        // //base case
        // if(head==null || head.next==null){
        //     return head;
        // }
        // //smaller problem
        // ListNode ans=reverseList(head.next);
        // //samll calculation
        // ListNode x=head.next;
        // x.next=head;
        // head.next=null;
        // return ans;
        // _____________________________________________
        //iteratively 
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode currP1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currP1;
        }
        head=prev;
        return head;

    }
}