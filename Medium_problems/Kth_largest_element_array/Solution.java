package Medium_problems.Kth_largest_element_array;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        Arrays.sort(nums);
        System.out.println(nums[nums.length - k]);
    }
}
