
// MEDIAN OF TWO SORTED ARRAY


// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
// The overall run time complexity should be O(log (m+n)).


// brute force
import java.util.Arrays;
public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        double ans = 0;

        System.arraycopy(nums1, 0, merged, 0, m);
        System.arraycopy(nums2, 0, merged, m, n);

        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));

        int l = merged.length;
        
        System.out.println(l);

        int i = l/2;

        System.out.println(i);

        if(l % 2 == 0) {
            ans = merged[i] + merged[i-1];
            ans = ans/2;
        }
        else {
            ans = merged[i];
        }
        // return ans;
        System.out.println(ans);
    }
}