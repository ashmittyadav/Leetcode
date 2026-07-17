// Given an integer array nums and an integer k, 
// return true if there are two distinct indices i and j in the array
// such that nums[i] == nums[j] and abs(i - j) <= k.

import java.util.HashMap;
public class main {

    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        Boolean ans = false;
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])>k) {
                    ans  = false;
            }
            else{
                ans = true;
                // System.out.println(ans);
            }
        }
        map.put(nums[i], i);
        System.out.println(map);
    }
    System.out.println(ans);
    // return ans;
}
}