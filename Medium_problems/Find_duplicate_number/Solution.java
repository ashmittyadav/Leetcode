/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2

Example 2:

Input: nums = [3,1,3,4,2]
Output: 3

Example 3:

Input: nums = [3,3,3,3,3]
Output: 3
*/

package Medium_problems.Find_duplicate_number;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {3,3,3,3,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
            System.out.println(map);
        }
        for(int key : map.keySet()) {
            if(map.get(key) > 1) {
                System.out.println(key);
            }
        }
    }
}
