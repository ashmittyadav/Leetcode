package Easy_problems.Intersection_of_two_array;

import java.util.HashSet;
import java.util.Set;

public class Optimal {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5}; 
        int[] nums2 = {9,4,9,8,4};
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        
        for(int num : nums1) {
            set.add(num);
        }

        for(int i = 0 ; i < nums2.length; i++) {
            if(set.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }
        int[] ans = new int[result.size()];
        int x = 0;
        for(int num : result) {
            ans[x] = num;
            x++;
        }
        System.out.println(ans);
    }
}
