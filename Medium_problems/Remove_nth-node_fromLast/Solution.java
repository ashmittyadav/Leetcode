/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:

Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:

Input: head = [1], n = 1
Output: []

Example 3:

Input: head = [1,2], n = 1
Output: [1]

*/

// package Medium_problems.Remove_nth-node_fromLast;
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode prev = head;
        // handles single node list
        if(head.next == null) {
            return null;
        }
        // counting length of head
        int length = 1;
        while(curr.next != null) {
            length++;
            curr= curr.next;
        } 
        // prevoius element of which to remove
        int remove = length - n;
        // if first element is to be removed
        if(remove == 0) {
            return head.next;
        }
        // assigning prev pointer 
        for(int i = 1; i < remove; i++) {
            prev = prev.next;
        }
        if(prev.next != null) {
            prev.next = prev.next.next;
        }

        return head;
    }
}
