public class missingNumberOptimal {
    public static void main(String[] args) {
         int[] nums = {9,6,4,2,3,5,7,0,1};
         int n = nums.length;
        int sum = 0;
        int totalSum = n*(n+1)/2;
        System.out.println(totalSum);
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        int missing = totalSum - sum;
        System.out.println(missing);
    }
}
