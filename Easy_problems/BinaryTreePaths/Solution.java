/*
Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.

 

Example 1:


Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
Example 2:

Input: root = [1]
Output: ["1"]
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<String>();
        if (root != null)
            search(root, "", ans);
        return ans;
    }

    private void search(TreeNode node, String path, List<String> ans) {
        if (node.left == null && node.right == null)
            ans.add(path + node.val);
        if (node.left != null)
            search(node.left, path + node.val + "->", ans);
        if (node.right != null)
            search(node.right, path + node.val + "->", ans);
    }
}
