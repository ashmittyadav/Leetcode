/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
*/

package Medium_problems.FirstAndLast_sorted_array;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int left = -1;
        int right = -1;

        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == target) {
                if(left == -1){
                   left = i; 
                }
                right = i;
            }
        }
        int[] ans = {left,right};
        System.out.println(Arrays.toString(ans));
    }
}
