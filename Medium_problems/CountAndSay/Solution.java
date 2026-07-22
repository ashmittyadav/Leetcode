package Medium_problems.CountAndSay;

public class Solution {
    public static void main(String[] args) {
        int n = 4;
        int count = 1;
        int say = 0;
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            result = result.append(say);
            // say = i;
            // result.append(count);
            // result.append(say);
            System.out.println(result);
            // count++;
            // say = result;
            say = 

            
        }
    }
}
