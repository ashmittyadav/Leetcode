
class Solution {
        // mid 
        private ListNode getMid(ListNode head) {
        ListNode slow = head;   
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }     
        return slow;
        }

        // merge
        private ListNode merge(ListNode head1, ListNode head2) {
            ListNode mergeNode = new ListNode(-1);
            ListNode temp = mergeNode;

            while(head1 != null && head2 != null) {
                if(head1.val <= head2.val) {
                    temp.next = head1;
                    head1 = head1.next;
                    temp = temp.next;
                } else {
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
                }
            }
            while(head1 != null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while(head2 != null) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            return mergeNode.next;
        }


        // ---main function---
    public ListNode sortList(ListNode head) {
        // base case
        if(head == null || head.next == null) {
            return head;
        }
        // find mid
        ListNode mid = getMid(head);

        // left and right half
        ListNode rightHead = mid.next;
        mid.next = null;
        ListNode leftHalf = sortList(head);
        ListNode rightHalf = sortList(rightHead);

        // merge
        return merge(leftHalf, rightHalf);
    }
}