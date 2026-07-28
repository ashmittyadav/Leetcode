package Medium_problems.Search_rotated_sorted_array;

public class Optimal {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        int start = 0; 
        int end = nums.length-1;
        
        while(start <= end) {
            int mid = start + (end-start)/2;

            if(nums[mid] == target) {
                return mid;
            }

            if(nums[mid] >= nums[start]) {
                if(target < nums[mid] && target >= nums[start]) {
                    end = mid-1;
                } else start = mid + 1;
            }
        }
        return -1;
    }
}
