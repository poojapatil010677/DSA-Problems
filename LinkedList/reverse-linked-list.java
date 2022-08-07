// https://leetcode.com/problems/reverse-linked-list/

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
        
        ListNode prev = new ListNode();
        ListNode curr = new ListNode();
        ListNode temp = new ListNode();
        
        // if head is null
        if (head == null) {
            return head;
        }
        
        prev = null;
        curr = head;
        temp = head.next;
        
        while(temp != null) {
            curr.next = prev;
            prev = curr;
            curr = temp;
            temp = temp.next;
        }
        
        curr.next = prev;
        head = curr;
        
        return head;
        
    }
}