/*
Given the head of a singly linked list where elements are sorted in ascending order, convert it to a height-balanced binary search tree.

 

Example 1:


Input: head = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.
Example 2:

Input: head = []
Output: []
*/

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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 import java.util.Vector;
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp = head;
        ListNode dummy = head;
        int length = 0;
        while(dummy != null) {
            length++;
            dummy = dummy.next;
        }
        int[] nums = new int[length]; // first find length
        int i = 0;
        while (temp != null) {
            nums[i] = temp.val;
            i++;
            temp = temp.next;
        }
        return build(nums, 0, nums.length-1);
    }
    private TreeNode build(int[] nums,int low,int high) {
        if(low > high) return null;
        int mid = low + (high - low) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = build(nums, low, mid - 1);
        root.right = build(nums, mid + 1, high);
        return root;
    }      
}