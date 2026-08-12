/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2

Output: [1,2]

Example 2:

Input: nums = [1], k = 1

Output: [1]

Example 3:

Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2

Output: [1,2]
*/

import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        int[] nums = {6,4,5,5,5,3,3,3};
        int k = 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        
        for(int key : map.keySet()) {
            int freq = map.get(key);
            if(bucket[freq] == null) bucket[freq] = new LinkedList<>();
            bucket[freq].add(key);
        }

        int[] ans = new int[k];
        int index = 0;
        for(int i = bucket.length - 1; i > 0 && index < k; i--) {
            if(bucket[i] != null) {
                for(int num : bucket[i]) {
                    ans[index++] = num;
                    if(index == k) break;
                }
            }
        }
        return ans;
    }
}

