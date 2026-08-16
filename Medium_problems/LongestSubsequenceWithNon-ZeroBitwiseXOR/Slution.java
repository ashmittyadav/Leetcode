class Solution {
    public int longestSubsequence(int[] nums) {
        int tot = 0;
        int n = nums.length;
        boolean zero = false;

        for (int num : nums) {
            zero |= num > 0;
            tot ^= num;
        }
        if (!zero)
            return 0;
        return tot == 0 ? n - 1 : n;
    }
}