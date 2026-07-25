
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int sum = 0;
        int[] result = new int[2];
        ArrayList<Integer> arr = new ArrayList<>();
        while(left < right) {
            sum = numbers[left] + numbers[right];
            if(sum == target) {
                arr.add(left+1);
                arr.add(right+1);
                result[0] = arr.get(0);
                result[1] = arr.get(1);
                return result;
            }
            else if(sum < target) {
                left++;
            }
            else{
                right--;
            }
        }
        return result;
        }
}