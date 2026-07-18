/*Given an integer array nums,
 move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.*/


class Solution {
    public void moveZeroes(int[] nums) {
        int p = 0;
        for(int i = 0; i < nums.length ; i++) {
            if(nums[p] == 0){
                if(nums[i] != nums[p]){
                    int temp = nums[i];
                    nums[i] = nums[p];
                    nums[p] = temp;
                    p++;
                }
            }
            else{
                p++;
            }
        }
    }
}