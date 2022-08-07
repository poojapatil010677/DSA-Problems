// https://leetcode.com/problems/merge-two-sorted-lists/

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        // if list1 is empty, return list2
        if (list1 == null) {
            return list2;
        }
        
        // if list2 is empty, return list1
        if (list2 == null) {
            return list1;
        }
        
        ListNode res = new ListNode();
        if (list1.val <= list2.val) {
            res = list1;
            res.next = mergeTwoLists(list1.next, list2);
        } else {
            res = list2;
            res.next = mergeTwoLists(list1, list2.next);
        }
        
        return res;
        
    }
}