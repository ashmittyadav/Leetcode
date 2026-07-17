// Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.

import java.util.HashSet;
public class missingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};


        // brute forcecd 
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        for(int i = 0; i <= nums.length ; i++) {
            Boolean check = set.contains(i);
            if(check == false) {
                System.out.println(i);
            }
        }


        // int max = 0;
        // int sum = 0;
        // for(int i = 0 ; i < nums.length; i++) {
            //     if(nums[i] != i) {
                //         System.out.println(i);
                //     }
                // } 
                
        //                 System.out.println("n:" + n);
        //                 System.out.println("length:" + nums.length);
        //         for(int i = 0; i < nums.length; i++) {
        //             sum = sum + nums[i]; 
        //         }
        //         System.out.println(sum);

        // for(int i = 0; i <= n; i++) {
        //     // System.out.println(i);
        //     max = max + i;
        // }
        // System.out.println(max);

        // if(max != sum) {
        //     int rem = max - sum;
        //     System.out.println(rem);
        // }
    }
}