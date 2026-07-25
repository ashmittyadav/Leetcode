/*
Given an integer array of size n, find all elements that appear more than ⌊n / 3⌋ times.

Example 1:

Input: nums = [3,2,3]
Output: [3]

Example 2:

Input: nums = [1]
Output: [1]

Example 3:

Input: nums = [1,2]
Output: [1,2]
*/


import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) { 
        int[] nums = {3,2,3};
        List<Integer> majorityElements = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>(); 
        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0 )+1);
        }
            for(int key : map.keySet()) {
                if(map.get(key) > n/3) {
                    majorityElements.add(key);
                }
            } 
        // return majorityElements;
        System.out.println(majorityElements);
    }
}