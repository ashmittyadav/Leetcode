/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*/

package Easy_problems.Intersection_of_two_array;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5}; 
        int[] nums2 = {9,4,9,8,4};
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < nums1.length; i++) {
            for(int j = 0 ; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    if(!ans.contains(nums1[i])) {
                        ans.add(nums1[i]);
                    }
                }
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        // return result;
    }
}
