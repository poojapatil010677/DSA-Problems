// https://leetcode.com/problems/linked-list-cycle-ii/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        //slow pointer
        ListNode slow = new ListNode();
        
        // fast pointer
        ListNode fast = new ListNode();
        
        if (head == null) {
            return head;
        }
        
        slow = head;
        fast = head;
        
        while(fast != null && fast.next != null) {
            
            slow = slow.next;
            fast = fast.next.next;
            
            // if slow and fast meet at the same node
            if (slow == fast) {
                break;
            }   
        }
        // there is no cycle in the given linked list, so return null
        if (fast == null || fast.next == null) {
            return null;
        }

        // if there is a cycle detected, then the distance from the start of the head to the start of the cycle
        // is same as the distance from the point of intersection of slow and fast pointer in the cycle.
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
        
    }
}