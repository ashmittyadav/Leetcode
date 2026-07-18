/*Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order.*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        for(int i = 0; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){       
                            sum = nums[i] + nums[j];
        if(sum == target){
            return new int[]{i,j};      //return 2 indices which are adding up to the target value
                                        // new keyword makes a new array conating int data values
        }
    }
}
    return nums;
    }
}