package Majority_Element;
import java.util.Arrays;
import java.util.HashMap;
public class Solution {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(Arrays.toString(nums));
        int n = nums.length;
        int majority = n/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet()){
            int res = map.get(key);
            if(majority < res){
                System.out.println(key);
            }
        }
    }
}
