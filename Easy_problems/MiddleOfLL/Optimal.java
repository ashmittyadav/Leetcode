class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode left = head;
        ListNode right = head;
        int length = 1;
        while(right != null) {
            length++;
            right = right.next;
        }
        int mid = length/2;
        int i = 1;
        if(length % 2 == 0) {
            while(i < mid){
                left = left.next;
                i++;
            }
        } else {    
            while(i <= mid) {
            left = left.next;
            i++;
            }
        }
        return left;
    }
}